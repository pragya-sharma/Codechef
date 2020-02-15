import java.util.Random;
import java.util.*;

public class ChefChick {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        // int[] array = new int[];
        String str = " ";
        for (int i = 0; i < 10; i++) {
            if ((i % 2 == 0 | i % 3 == 0) & (i != 0)) {
                str = str + " " + i;
            }
        }
        String[] stringarray = str.split(" ");
        int[] array = new int[stringarray.length];
        //System.out.print(Arrays.toString(str));
        for (int j = 0; j < stringarray.length; j++) {
            array[j] = Integer.parseInt(stringarray[j]);
        }
        System.out.print(Arrays.toString(array));
        //}

    };
};


