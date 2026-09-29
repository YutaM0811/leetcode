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
    int pairSum(ListNode* head) {
        vector<int> v;
        int max=0;
        while(head!=nullptr) {
            v.push_back(head->val);
            head=head->next;
        }
        int i=0, j=v.size()-1;
        while(i<=j) {
            int sum=v[i]+v[j];
            max=max<sum ?sum :max;
            ++i;
            --j;
        }
        return max;
    }
};
