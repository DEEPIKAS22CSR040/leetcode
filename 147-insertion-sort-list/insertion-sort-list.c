/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertionSortList(struct ListNode* head) {
    struct ListNode* temp2=head->next;
    struct ListNode* temp1=head;
    while(temp1)
    {
        temp2=temp1->next;
        while(temp2)
        {
            if(temp1->val > temp2->val)
            {
                int t=temp1->val;
                temp1->val=temp2->val;
                temp2->val=t;
            }
            temp2=temp2->next;
        }
        temp1=temp1->next;
    }
    return head;
    
}