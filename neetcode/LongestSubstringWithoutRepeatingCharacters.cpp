# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int m=0;
        for(int i=0; i<s.size(); ++i) {
            unordered_set<int> set;
            set.insert(s[i]);
            for(int j=i+1; j<s.size(); ++j) {
                if(set.contains(s[j])) break;
                set.insert(s[j]);
            }
            m=m<set.size() ?set.size() :m;
        }
        return m;
    }
};
