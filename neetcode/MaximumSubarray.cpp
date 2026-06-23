#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int c_sum=0, m_sum=INT_MIN;
        for(int i=0; i<nums.size(); ++i) {
            c_sum=c_sum<0 ?nums[i] :c_sum+nums[i];
            if(m_sum<c_sum) m_sum=c_sum;
        }
        return m_sum;
    }
};
