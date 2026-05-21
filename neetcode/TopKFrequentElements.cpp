# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> b(2002);
        for(int i=0; i<nums.size(); ++i) {
            ++b[nums[i]+1000];
        }
        vector<pair<int,int>> c;
        for(int i=0; i<b.size(); ++i) {
            if(b[i]>0) {
                c.push_back({b[i],i-1000});
            }
        }
        sort(c.begin(),c.end(),greater<pair<int,int>>());
        vector<int> r;
        for(int i=0; i<k; ++i) {
            auto& p=c[i];
            r.push_back(p.second);
        }
        return r;
    }
};

