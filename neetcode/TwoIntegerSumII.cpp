# include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> v(2);
        int r=0,l=numbers.size()-1;
        while(r<l) {
            int s=numbers[r]+numbers[l];
            if(s>target) --l;
            else if(s<target) ++r;
            else {
                v[0]=r+1;
                v[1]=l+1;
                return v;
            }
        }
        return v;
    }
};
