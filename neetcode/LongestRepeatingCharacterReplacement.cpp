# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int characterReplacement(string s, int k) {
        vector<int> v(26,0);
        int maxL=0,maxC=0,l=0;
        for(int r=0; r<s.length(); ++r) {
            ++v[s[r]-'A'];
            maxC=max(maxC,v[s[r]-'A']);
            while((r-l+1)-maxC>k) {
                --v[s[l]-'A'];
                ++l;
            }
            maxL=max(maxL,r-l+1);
        }
        return maxL;
    }
};

