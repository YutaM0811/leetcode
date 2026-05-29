# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& heights) {
        int max=0;
        int l=0,r=heights.size()-1;
        while(l<r) {
            int lh=heights[l];
            int rh=heights[r];
            int sh=lh<rh ?lh :rh;
            int a=sh*(r-l);
            max=a>max ?a :max;
            if(sh==lh) ++l;
            else --r;
        }
        return max;
    }
};

