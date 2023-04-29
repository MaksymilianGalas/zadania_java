package zad2;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileSum {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 0;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 2 == 0) {
                    sum += Integer.parseInt(line);
                }
            }

            bufferedReader.close();

            System.out.println("Suma co drugiej linii: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
