/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;

class Solution {
    public ListNode partition(ListNode temp, int x) {
        if (temp == null || temp.next == null)
            return temp;

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // Step 1: Traverse and split values into l1 and l2
        while (temp != null) {
            if (temp.val < x)
                l1.add(temp.val);
            else
                l2.add(temp.val);
            temp = temp.next;
        }

        ListNode head1 = null;
        ListNode tail = null;

        // Step 2: Construct new linked list using l1
        for (int i : l1) {
            ListNode newnode = new ListNode(i);
            if (head1 == null) {
                head1 = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        // Step 3: Construct remaining linked list using l2
        for (int i : l2) {
            ListNode newnode = new ListNode(i);
            if (tail == null) { // If l1 was empty
                head1 = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        return head1;
    }
}
