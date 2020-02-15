/*
SHE IS A GOOD GIRL. << input
VKH LV D JRRG JLUO.  << output
*/

import java.util.*;

class Jaadu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        str1 = str1.toUpperCase();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'W') {
                System.out.print((char) ((int) (str1.charAt(i)) + 3));
            } else if (str1.charAt(i) >= 'X' && str1.charAt(i) <= 'Z') {
                if (str1.charAt(i) == 'X')
                    System.out.print("A");
                else if (str1.charAt(i) == 'Y')
                    System.out.print("B");
                else if (str1.charAt(i) == 'Z')
                    System.out.println("C");
            } else if (str1.charAt(i) == ' ')
                System.out.print(" ");
            else System.out.print(str1.charAt(i));
        }

    }
}
