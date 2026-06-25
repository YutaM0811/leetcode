#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int jump(vector<int>& nums) {
        if(nums.size()==0) return 0;
        int c=0, curr_end=0, furthest=0;
        for(int i=0; i<nums.size()-1; ++i) {
            furthest=max(furthest, i+nums[i]);
            if(i==curr_end) {
                ++c;
                curr_end=furthest;
                if(curr_end>=nums.size()-1) break;
            }
        }
        return c;
    }
};
