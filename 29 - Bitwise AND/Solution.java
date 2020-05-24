import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Sample Input

3
5 2
8 5
2 2
Sample Output

1
4
0
*/

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static int maxAnd(int n, int k) {
        /*
         * Find max Bitwise AND between elements A&B in set {1,2,3,4...n} given the AND
         * < k and A < B
         */
        int[] set = new int[n];
        for (int i = 0; i < n; i++) {
            set[i] = i + 1;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // System.out.println("(" + i + ", " + j + ")");
                int and = set[i] & set[j];
                if (and > max && and < k) {
                    max = and;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            System.out.println(maxAnd(n, k));
        }

        scanner.close();
    }
}
