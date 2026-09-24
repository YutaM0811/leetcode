#include <bits/stdc++.h>
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
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode* curr=head;
        while(curr!=nullptr&&curr->next!=nullptr) {
            int gcd_val=gcd(curr->val,curr->next->val);
            ListNode* gcd_node=new ListNode(gcd_val, curr->next);
            curr->next=gcd_node;
            curr=gcd_node->next;
        }
        return head;
    }
};
