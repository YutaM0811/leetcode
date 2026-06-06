#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        map<int, int, greater<int>> map;
        for(int i=0; i<position.size(); ++i) {
            map[position[i]]=speed[i];
        }
        stack<double> st;
        for(auto& [k,v] : map) {
            double t=(double)(target-k)/v;
            if(st.empty() || st.top()<t) {
                st.push(t);
                continue;
            }
        }
        return st.size();
    }
};
