/*
  pragya is a good girl.  input
  sudjbd  lv d jrrg jluo.  output
 */
import java.util.*;
public class Jaaadu {
    public static void main(String[] args) {
        char newchar=' ';
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] ch = str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            String var =  new String("ch[i]");
            if(str2.contains(var)) {
                int index = str2.indexOf(ch[i]);
                int value = index + 3;
                 newchar = str2.charAt(value);
            }

                System.out.print(newchar);

        }

    }
}
