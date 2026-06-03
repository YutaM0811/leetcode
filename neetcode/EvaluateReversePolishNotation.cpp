# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        for(int i=0; i<tokens.size(); ++i) {
            string s=tokens[i];
            if(s!="+" && s!="-" && s!="*" && s!="/") {
                st.push(stoi(s));
                continue;
            }
            int o1=st.top();
            st.pop();
            int o2=st.top();
            st.pop();
            int r=0;
            if(s=="+") r=o2+o1; 
            else if(s=="-") r=o2-o1; 
            else if(s=="*") r=o2*o1; 
            else if(s=="/") r=o2/o1; 
            st.push(r);
        }
        return st.top();
    }
};
