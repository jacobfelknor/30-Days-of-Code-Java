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