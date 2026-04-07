#include <algorithm>

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        std::vector<int>::iterator it=std::max(nums.begin(),nums.end());
        int x=0,y=0;
        for(int i=0; i<=nums.size(); ++i) {
            x+=i;
        }
        for(int i=0; i<nums.size(); ++i) {
            y+=nums[i];
        }
        return x-y;
    }
};

