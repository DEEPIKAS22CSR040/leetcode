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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        List<Integer>l=new ArrayList<>();
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.reverse(l);
        temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val=l.get(i++);
            temp=temp.next;
        }
        return head;
        
    }
}