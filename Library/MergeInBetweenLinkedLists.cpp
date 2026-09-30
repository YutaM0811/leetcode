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
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        ListNode* pA=list1;
        ListNode* aB=list1;
        for(int i=0; i<a-1; ++i) {
            pA=pA->next;
        }
        for(int i=0; i<b+1; ++i) {
            aB=aB->next;
        }
        ListNode* list2Tail=list2;
        while(list2Tail->next!=nullptr) {
            list2Tail=list2Tail->next;
        }
        pA->next=list2;
        list2Tail->next=aB;
        return list1;
    }
};
