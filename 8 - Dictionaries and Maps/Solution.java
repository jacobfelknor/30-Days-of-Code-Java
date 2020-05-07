import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phonebook;
        phonebook = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            Integer number = phonebook.get(s);
            if (number != null) {
                System.out.println(s + "=" + number);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}