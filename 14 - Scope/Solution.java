import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input

3
1 2 5
Sample Output

4
*/

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    public void computeDifference() {
        int min = this.elements[0];
        int max = this.elements[0];
        for (int i = 1; i < this.elements.length; i++) {
            min = Math.min(min, this.elements[i]);
            max = Math.max(max, this.elements[i]);
        }

        this.maximumDifference = max - min;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}