class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=nums.size();
        nums.reserve(n*2);
        nums.insert(nums.end(),nums.begin(),nums.begin()+n);
        return nums;
    }
};
