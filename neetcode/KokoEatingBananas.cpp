#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1;
        int hi=*max_element(piles.begin(), piles.end());
        int a=hi;
        while(l<=hi) {
            int m=l+(hi-l)/2;
            long long tt=0;
            for(int i=0; i<piles.size(); ++i) {
                tt+=((long long)piles[i]+m-1)/m;
            }
            if(tt<=h) {
                a=m;
                hi=m-1;
            } 
            else l=m+1;
        }
        return a;
    }
};
