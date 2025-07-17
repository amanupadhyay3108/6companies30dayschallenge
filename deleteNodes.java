import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class deleteNodes {
     static void linkdelete(Node head, int n, int m) {
        // your code here
        Node curr = head;

        while (curr != null) {
            // Skip m nodes
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }

            // If we reached the end, break
            if (curr == null || curr.next == null) return;

            // Start deletion from next node
            Node temp = curr.next;
            for (int i = 1; i <= n && temp != null; i++) {
                temp = temp.next;
            }

            // Link the current m-th node to the node after n deletions
            curr.next = temp;

            // Move current to temp to continue the process
            curr = temp;
        }
    }
}
