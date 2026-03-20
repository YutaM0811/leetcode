#include <algorithm>

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
class Solution {
public:
    int diameterOfBinaryTree(TreeNode* root) {
        max=0;
        updateHeight(root);
        return max;
    }

private:
    int max=0;

    int updateHeight(TreeNode* root) {
        if(root==nullptr) return 0;
        int left=updateHeight(root->left);
        int right=updateHeight(root->right);
        max=std::max(max,left+right);
        return std::max(left,right)+1;
    }
};