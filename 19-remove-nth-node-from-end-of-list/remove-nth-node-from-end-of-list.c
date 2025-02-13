/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int k) {
    int n=0;
    struct ListNode* temp=head;
    struct ListNode* prev=head;
    while(temp)
    {
        n++;
        temp=temp->next;
    }
    n=n-k;
    if(n==0)
    return head->next;
    temp=head;
    for(int i=1;i<=n;i++)
    {
        prev=temp;
        temp=temp->next;
    }
    prev->next=temp->next;
    return head;
    
}