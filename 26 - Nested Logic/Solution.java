import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input

9 6 2015
6 6 2015
Sample Output

45
*/

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        // Returned Dates
        int rday = scanner.nextInt();
        int rmonth = scanner.nextInt();
        int ryear = scanner.nextInt();
        // Expected dates
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        // System.out.print(rday + " " + rmonth + " " + ryear + "\n");
        // System.out.print(day + " " + month + " " + year + "\n");
        if (ryear <= year) {
            if (ryear < year) {
                // Book was returned before expected year. No fine
                System.out.println("0");
            } else {
                // Book was returned in correct year
                if (rmonth <= month) {
                    if (rmonth == month) {
                        // Book returned in correct month
                        if (rday <= day) {
                            // Book returned on or before expected day, in same month, in same year. No fine
                            System.out.println("0");
                        } else {
                            // Book was returned after expected day, in same month, in same year.
                            System.out.println(15 * (rday - day));
                        }
                    } else {
                        // Book returned before expected month, in same year. No fine
                        System.out.println("0");
                    }
                } else {
                    // Book was returned in same year but after expected return month
                    System.out.println(500 * (rmonth - month));
                }
            }
        } else {
            // Book was not returned in correct year
            System.out.println("10000");
        }

        scanner.close();
    }
}