import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19
*/

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printArray(int[][] arr) {
        // Print array contents
        for (int i = 0; i < 6; i++) {
            // print the row of space-separated values
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
    }

    public static void printHourGlass(int[][] arr) {
        // Print hourglasses
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(arr[i - 1][j - 1] + " ");
                System.out.print(arr[i - 1][j] + " ");
                System.out.print(arr[i - 1][j + 1] + " ");

                System.out.println();

                System.out.print(" ");
                System.out.print(arr[i][j] + " ");
                System.out.print(" ");

                System.out.println();

                System.out.print(arr[i + 1][j - 1] + " ");
                System.out.print(arr[i + 1][j] + " ");
                System.out.print(arr[i + 1][j + 1] + " ");

                System.out.println();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                current = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
                        + arr[i + 1][j] + arr[i + 1][j + 1];

                if (current > max) {
                    max = current;
                }

            }
        }

        System.out.println(max);

        scanner.close();
    }
}
