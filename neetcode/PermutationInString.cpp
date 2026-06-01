# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        vector<int> v(26,0);
        for(int i=0; i<s1.length(); ++i) {
            ++v[s1[i]-'a'];
        }
        int l=0,r=s1.length();
        while(r<=s2.length()) {
            vector<int> vv(26,0);
            for(int i=l; i<r; ++i) {
                ++vv[s2[i]-'a'];
            }
            if(vv==v) return true;
            ++l;
            ++r;
        }
        return false;
    }
};
