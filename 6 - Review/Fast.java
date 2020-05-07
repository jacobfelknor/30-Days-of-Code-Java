import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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