#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> lexicalOrder(int n) {
        vector<string> vs;
        vector<int> vi;
        for(int i=0; i<n; ++i) {
            vs.push_back(to_string(i+1));
        }
        sort(vs.begin(),vs.end());
        for(int i=0; i<n; ++i) {
            vi.push_back(stoi(vs[i]));
        }
        return vi;
    }
};
