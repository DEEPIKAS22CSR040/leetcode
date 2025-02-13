/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    struct ListNode *temp=head;
    struct ListNode* prev=head;
    int n=0;
    while(temp)
    {
        n++;
        temp=temp->next;
    }
    if(n==0 || n==1)
    return 0;
    temp=head;
    for(int i=1;i<=n/2;i++)
    {
        prev=temp;
        temp=temp->next;
    }
    prev->next=temp->next;
    return head;
    
}