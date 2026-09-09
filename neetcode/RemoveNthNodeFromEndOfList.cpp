# include <bits/stdc++.h>
using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* c=head;
        int l=0;
        while(c!=nullptr) {
            ++l;
            c=c->next;
        }
        ListNode* d=new ListNode(0, head);
        ListNode* p=d;
        int i=0;
        while(i<l-n) {
            p=p->next;
            ++i;
        }
        p->next=p->next->next;
        return d->next;
    }
};
