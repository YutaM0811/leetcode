#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isNStraightHand(vector<int>& hand, int groupSize) {
        if(hand.size()%groupSize!=0) return false;
        map<int, int> map;
        for(int i=0; i<hand.size(); ++i) {
            ++map[hand[i]];
        }
        for(auto const& [card, count] : map) {
            if(map[card]==0) continue;
            int c=map[card];
            for(int i=0; i<groupSize; ++i) {
                int nc=card+i;
                if(map[nc]<c) return false;
                map[nc]-=c;
            }
        }
        return true;
    }
};
