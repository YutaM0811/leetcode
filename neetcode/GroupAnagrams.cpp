# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        map<vector<int>,vector<string>> mp;
        for(int i=0; i<strs.size(); ++i) {
            vector<int> v(26);
            for(char c:strs[i]) {
                ++v[c-'a'];
            }
            mp[v].push_back(strs[i]);
        }
        for(auto& [k,v]:mp) {
            vector<string> list;
            for(string s:v) list.push_back(s);
            result.push_back(list);
        }
        return result;
    }
};

