# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> s;
        int max=0;
        for(int i=0; i<nums.size(); ++i) {
            s.insert(nums[i]);
        }
        for(int i=0; i<nums.size(); ++i) {
            int n=nums[i];
            if(s.contains(n-1)) continue;
            int c=0;
            while(s.contains(n)) {
                ++c;
                ++n;
            }
            max=max<c ?c :max;
        }
        return max;
    }
};

