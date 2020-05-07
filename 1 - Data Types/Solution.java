import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j;
        double d_2;
        String s_2;
        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        j = scanner.nextInt();
        d_2 = scanner.nextDouble();
        scanner.nextLine();
        s_2 = scanner.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d_2);
        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */
        System.out.println(s + s_2);

        scanner.close();
    }
}