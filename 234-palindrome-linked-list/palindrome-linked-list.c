bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return true;  
    }

    
    struct ListNode *l = NULL; 
    struct ListNode *temp = head;
    struct ListNode *temp1 = NULL;
    
    while (temp) {
        
        struct ListNode *newnode = (struct ListNode *)malloc(sizeof(struct ListNode));
        
        newnode->val = temp->val;
        newnode->next = NULL;
        
        if (l == NULL) {
            l = newnode; 
            temp1 = newnode;
        } else {
            temp1->next = newnode;  
            temp1 = newnode;
        }
        temp = temp->next;
    }

    
    struct ListNode *curr = l, *next = NULL, *prev = NULL;
    while (curr) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
   
    temp = head;
    struct ListNode *rev = prev;
    while (temp && rev) {
        if (temp->val != rev->val) {
            return false; 
        }
        temp = temp->next;
        rev = rev->next;
    }
    
    return true; 
}
