import java.util.*;
public class RkkuProgram {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int m = Integer.parseInt(n);
        char[] ch = n.toCharArray();
        char[] half1array;
        char[] halfLast;
        for(int i=0;i<ch.length;i++){
            count++;
        }
        System.out.println("no of digit is"+count);
        if(count%2 != 0){
            System.out.println("to bhi kaam ka hai");
        }
        else{
            int halfOfDigit = (ch.length)/2;
            System.out.println(halfOfDigit);
            half1array = new char[halfOfDigit];
            halfLast = new char[halfOfDigit];
            for(int j=0;j<halfOfDigit;j++){
                half1array[j] = ch[j];
            }
            for(int k=0;k<half1array.length;k++){
                // half first digit
                System.out.print(half1array[k]+" ");
            }
            System.out.println();
            int cou=0;
            for(int p=halfOfDigit;p<ch.length-1;p++){
                halfLast[cou++]=ch[p];
            }
            for(int u = 0;u<=halfLast.length;u++){
            //while (halfLast != null){
                System.out.print(halfLast+" ");
            }
        }

    }
}

