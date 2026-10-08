#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> vv(n,vector<int>(n));
        int x=0, y=0, c=1;
        while(c<=n*n) {
            for(;y<n&&vv[x][y]==0; ++y) vv[x][y]=c++;
            --y; ++x;
            for(;x<n&&vv[x][y]==0; ++x) vv[x][y]=c++;
            --y; --x;
            for(;y>=0&&vv[x][y]==0; --y) vv[x][y]=c++;
            ++y; --x;
            for(;x>=0&&vv[x][y]==0; --x) vv[x][y]=c++;
            ++y; ++x;
        }
        return vv;
    }
};
