# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_set<int> set;
        for(int i=0; i<nums.size(); ++i) {
            if(!set.insert(nums[i]).second) return nums[i];
        }
        return 0;
    }
};
