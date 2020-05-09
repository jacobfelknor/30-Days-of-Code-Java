import java.util.*;

/*
    Sample Input:
    Welcome to 30 Days of Code!

    Sample Output:
    Hello, World. 
    Welcome to 30 Days of Code!

*/

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable,
        // inputString.
        System.out.println("Enter a string:");
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("\nHello, World. You said:");

        // TODO: Write a line of code here that prints the contents of inputString to
        // stdout.
        System.out.println(inputString);
    }
}
