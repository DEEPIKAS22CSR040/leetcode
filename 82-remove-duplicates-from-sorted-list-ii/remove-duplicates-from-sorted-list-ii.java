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
    ListNode h=null,tail=null;
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        while(temp!=null)
        {
            int x=temp.val;
            map.put(x,(map.getOrDefault(x,0)+1));
            temp=temp.next;
        } 
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==1)
            insert(e.getKey());
        } 
        return h;    

        
    }
    void insert(int n)
    {
        ListNode newnode=new ListNode(n);
        if(h==null)
        {
            h=newnode;
            tail=h;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

}