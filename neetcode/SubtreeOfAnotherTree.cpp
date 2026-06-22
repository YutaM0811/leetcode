/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        if(root==nullptr) return false;
        bool curr=isSame(root, subRoot);

        bool left=isSubtree(root->left, subRoot);
        bool right=isSubtree(root->right, subRoot);
        return curr||left||right;
    }

    bool isSame(TreeNode* p, TreeNode* q) {
        if(p==nullptr && q==nullptr) return true;
        if(p==nullptr || q==nullptr) return false;
        if(p->val!=q->val) return false;

        bool left=isSame(p->left, q->left);
        bool right=isSame(p->right, q->right);
        return left&&right;
    }
};
