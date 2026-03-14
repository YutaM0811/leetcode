#include <stack>
#include <unordered_set>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        if(s.length()%2!=0) return false;
        stack<char> st;
        unordered_set<char> set={')','}',']'};
        for(int i=0; i<s.length(); i++) {
            if(set.contains(s[i])) {
                if(st.empty()) return false;
                if(s[i]==')' && st.top()=='(') {
                    st.pop();
                    continue;
                } else if(s[i]==']' && st.top()=='[') {
                    st.pop();
                    continue;
                } else if(s[i]=='}' && st.top()=='{') {
                    st.pop();
                    continue;
                }
            }
            st.push(s[i]);
        }
        return st.empty();
    }
};
