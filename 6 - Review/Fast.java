import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */

public class Fast {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j += 2) {
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < str.length(); j += 2) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

}