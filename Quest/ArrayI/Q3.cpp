# include <vector>
using namespace std;

class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int m=0,c=0;
        bool b=false;
        for(int i=0; i<nums.size(); ++i) {
            if(nums[i]==1) {
                ++c;
                continue;
            }
            m=m<c ?c:m;
            c=0;
            b=false;
        }
        m=m<c ?c:m;
        return m;
    }
};
