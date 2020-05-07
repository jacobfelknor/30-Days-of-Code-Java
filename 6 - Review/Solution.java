import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            List<String> evens = new ArrayList<String>();
            List<String> odds = new ArrayList<String>();
            for (int c = 0; c < str.length(); c++) {
                if (c % 2 == 0) {
                    evens.add(Character.toString(str.charAt(c)));
                } else {
                    odds.add(Character.toString(str.charAt(c)));
                }
            }

            for (int j = 0; j < evens.size(); j++) {
                System.out.print(evens.get(j));
            }
            System.out.print(" ");
            for (int j = 0; j < odds.size(); j++) {
                System.out.print(odds.get(j));
            }
            System.out.println();
        }
    }
}