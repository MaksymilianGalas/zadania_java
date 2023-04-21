package zad4;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int p = 0;  // ilosc liczb
        int r =0;   // ilosc bialych znakow
        int s =0;   // ilosc innych znakow
        int x =0;   // ilosc liter
        int y =0;   // ilosc samoglosek
        int z =0;   // ilosc spolglosek

        int[] biale = new int[33];
        for(int i=0; i<=32; i++){
            biale[i] = i;                //asci "bialych" znakow
        }

        int[] samogloski = new int[]{97, 101, 105, 111, 117, 243, 261, 281, 89}; //ascii malych liter + duże litery polskie
        int[] spolgloski = new int[]{98, 99, 263, 100, 102, 103, 104, 106, 107, 108, 322, 109, 110, 324, 112, 114, 115, 347, 116, 119, 122, 378, 380, 380};
        int[] pozostale = new int[]{102, 107, 119, 122};
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        for (int i = 0; i < text.length(); i++) {
            boolean num = Character.isDigit(text.charAt(i));
            char c = Character.toLowerCase(text.charAt(i));
            int asciiValue = (int) c;
            for (int k = 0; k < spolgloski.length; k++) {
                if (asciiValue == spolgloski[k]) {
                    z++;
                    break;
                }
            }for (int l = 0; l < samogloski.length; l++) {
                if (asciiValue == samogloski[l]) {
                    y++;
                    break;
                }
            }for (int m = 0; m < biale.length; m++) {
                if (asciiValue == biale[m]) {
                    r++;
                    break;
                }
            }for (int m = 0; m < pozostale.length; m++) {
                if (asciiValue == pozostale[m]) {
                    x++;
                    break;
                }
            }if(num){
                p++;
            }

        }
        x = x+z+y;
        s = (text.length() -p -x);
        System.out.println("ilosc liczb:" + p);
        System.out.println("ilosc liter:" + x);
        System.out.println("biale znaki: " + r);
        System.out.println("spolgloski: " + z);
        System.out.println("samogloski: " + y);
        System.out.println("inne znaki:" + s);
    }
}