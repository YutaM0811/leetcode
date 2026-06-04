#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> v(temperatures.size(),0);
        stack<int> st;
        for(int i=0; i<temperatures.size(); ++i) {
            while(!st.empty() && 
                    temperatures[i]>temperatures[st.top()]) {
                v[st.top()]=i-st.top();
                st.pop();
            }
            st.push(i);
        }
        return v;
    }
};
