#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int max_r=nums[0];
        for(int i=1; i<nums.size(); ++i) {
            if(max_r<i) return false;
            if(max_r<i+nums[i]) max_r=i+nums[i];
        }
        return true;
    }
};
