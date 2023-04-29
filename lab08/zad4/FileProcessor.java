package zad4;

import java.io.*;
import java.text.*;
import java.util.*;

public class FileProcessor {
    public static void main(String[] args) {

        File inboundDir = new File("inbound");


        File outboundDir = new File("outbound");
        if (!outboundDir.exists()) {
            outboundDir.mkdir();
        }

        File[] files = inboundDir.listFiles();


        for (File file : files) {

            if (file.isDirectory()) {
                continue;
            }

            try {
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[(int) file.length()];
                fis.read(data);
                fis.close();

                String text = new String(data);
                text = text.replaceAll(" ", "_");

                char[] chars = text.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if (c >= 'a' && c <= 'z') {
                        c = (char) (((c - 'a' + 3) % 26) + 'a');
                    } else if (c >= 'A' && c <= 'Z') {
                        c = (char) (((c - 'A' + 3) % 26) + 'A');
                    }
                    chars[i] = c;
                }
                text = new String(chars);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
                String dateStr = dateFormat.format(new Date());
                String fileName = file.getName().replaceAll("\\.txt$", "");
                File outFile = new File(outboundDir, fileName + "_" + dateStr + ".out");
                FileOutputStream fos = new FileOutputStream(outFile);
                fos.write(text.getBytes());
                fos.close();

                file.delete();

                System.out.println("Przetworzono plik: " + file.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
