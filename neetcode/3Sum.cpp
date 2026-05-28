# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> vv;
        for(int i=0; i<nums.size(); ++i) {
            if(i>0&&nums[i-1]==nums[i]) continue;
            int l=i+1,r=nums.size()-1;
            while(l<r) {
                int ln=nums[l],rn=nums[r];
                int n=nums[i]+ln+rn;
                if(n>0) --r;
                else if(n<0) ++l;
                else {
                    vector<int> v;
                    v.push_back(nums[i]);
                    v.push_back(nums[l]);
                    v.push_back(nums[r]);
                    vv.push_back(v);
                    while(l<nums.size()-1&&ln==nums[l]) {
                        ++l;
                    }
                }
            }
        }
        return vv;
    }
};
