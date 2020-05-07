import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);
        int longest = 0;
        int current = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                current++;
            } else {
                if (current > longest) {
                    longest = current;
                }
                current = 0;
            }
        }
        if (current > longest) {
            longest = current;
        }

        System.out.println(longest);

        scanner.close();
    }
}
