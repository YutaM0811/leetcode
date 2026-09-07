# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int arrangeCoins(int n) {
        int c=0,j=0;
        while(n-j>0) {
            ++j;
            n-=j;
            ++c;
        }
        return c;
    }
};
