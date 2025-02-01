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

        
        while (temp != null) {
            if (temp.val < x)
                l1.add(temp.val);
            else
                l2.add(temp.val);
            temp = temp.next;
        }

        ListNode head1 = null;
        ListNode tail = null;

       
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

       
        for (int i : l2) {
            ListNode newnode = new ListNode(i);
            if (tail == null) { 
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
