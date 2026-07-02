/**
 * Definition of Interval:
 * class Interval {
 * public:
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 * }
 */
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool canAttendMeetings(vector<Interval>& intervals) {
        vector<bool> v(1000005);
        for(int i=0; i<intervals.size(); ++i) {
            int s=intervals[i].start;
            int e=intervals[i].end;
            if(v[s] && v[s+1]) return false;
            for(int j=s+1; j<=e; ++j) {
                if(v[j]) return false;
                v[j]=true;
            }
        }
        return true;
    }
};
