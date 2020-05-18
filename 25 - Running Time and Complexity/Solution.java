import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
*/

public class Solution {
    /**
     * If a number n is not a prime, it can be factored into two factors a and b:
     * 
     * n = a * b If both a and b were greater than the square root of n, then a * b
     * would be greater than n. So at least one of those factors must be less than
     * or equal to the square root of n, and if we can't find any factors less than
     * or equal to the square root, n must be prime.
     * 
     * Source:
     * https://stackoverflow.com/questions/5811151/why-do-we-check-up-to-the-square-root-of-a-prime-number-to-determine-if-it-is-pr
     */
    public static boolean isPrime(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            // arr[i] = scanner.nextInt();
            if (isPrime(scanner.nextInt())) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

        scanner.close();
    }
}
