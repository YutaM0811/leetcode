# include <vector>
# include <unordered_set>
using namespace std;

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        vector<int> v;
        unordered_set<int> s;
        for(int i=0; i<nums.size(); ++i) {
            if(s.contains(nums[i])) v.push_back(nums[i]);
            s.insert(nums[i]);
        }
        for(int i=1; i<=nums.size(); ++i) {
            if(!s.contains(i)) {
                v.push_back(i);
                return v;
            }
        }
        return v;
    }
};
