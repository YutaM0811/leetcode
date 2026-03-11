#include<iostream>
#include<string>
#include<unordered_map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int,int>map;
        std::vector<int>list;
        for(int i=0; i<nums.size(); i++) {
            int n=target-nums[i];
            std::unordered_map<int,int>::iterator it=map.find(n);
            if(it!=map.end()) {
                list.push_back(it->second);
                list.push_back(i);
                return list;
            }
            map[nums[i]]=i;
        }
        return list;
    }
};
