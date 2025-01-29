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
/*class Solution {
    ListNode l;
    public ListNode mergeNodes(ListNode head) {        
        head=head.next;
        while(head!=null)
        {
            int sum=0;
            while(head.val!=0)
            {
                sum=sum+head.val;
                head=head.next;
            } 
            insert(sum);       
           head=head.next; 
        }
        return l;        
    }
    void insert(int data)
    {
        ListNode newnode=new ListNode(data);
        if(l==null)
        {
            l=newnode;
            return;
        }
        ListNode temp=l;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=newnode;
    }
}*/

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify list construction
        ListNode currentNew = dummy; // Pointer to construct new list
        ListNode currentOld = head.next; // Start from the node after the initial zero

        int sum = 0;
        
        while (currentOld != null) {
            if (currentOld.val == 0) {
                // When we hit a zero, we need to create a new node with the sum if sum is non-zero
                if (sum != 0) {
                    currentNew.next = new ListNode(sum);
                    currentNew = currentNew.next;
                    sum = 0; // Reset sum for the next segment
                }
            } else {
                // Accumulate the sum of values between zeros
                sum += currentOld.val;
            }
            currentOld = currentOld.next;
        }

        return dummy.next; // The first node in the dummy list is the start of the result list
    }
}