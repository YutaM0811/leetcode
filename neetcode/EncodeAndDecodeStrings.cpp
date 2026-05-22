# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string encode(vector<string>& strs) {
        string s="";
        for(int i=0; i<strs.size(); ++i) {
            string l=to_string(strs[i].length());
            s+=l+"#"+strs[i];
        }
        return s;
    }

    vector<string> decode(string s) {
        vector<string> v;
        int i=0;
        while(i<s.length()) {
            int j=i;
            while(s[j]!='#') {
                ++j;
            }
            string ns=s.substr(i,j-i);
            int n=stoi(ns);
            string ss=s.substr(j+1,n);
            v.push_back(ss);
            i=j+1+n;
        }
        return v;
    }
};

