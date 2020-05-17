import java.io.*;
import java.util.*;

/*
Sample Input

6
1
2
2
3
3
4
Sample Output

1 2 3 4 
*/

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class Solution {

    public static Node removeDuplicates(Node head) {
        // Write your code here
        if (head == null) {
            return head;
        }
        Map<Integer, Boolean> seen = new HashMap<>();
        Node node = head;
        Node prev = null;
        while (node != null) {
            Boolean b = seen.get(node.data);
            if (b != null && b) {
                // we've seen this data before...
                if (prev == null) {
                    // head case
                    head = head.next;
                } else {
                    // unlink current node
                    prev.next = node.next;
                }
            } else {
                // store data as seen
                seen.put(node.data, true);
            }

            prev = node;
            node = node.next;
        }

        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}