# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> l(nums.size(),1);
        vector<int> r(nums.size(),1);
        vector<int> v;
        for(int i=0; i<nums.size()-1; ++i) {
            l[i+1]=l[i]*nums[i];
        }
        for(int i=nums.size()-1; i>0; --i) {
            r[i-1]=r[i]*nums[i];
        }
        for(int i=0; i<nums.size(); ++i) {
            v.push_back(l[i]*r[i]);
        }
        return v;
    }
};

