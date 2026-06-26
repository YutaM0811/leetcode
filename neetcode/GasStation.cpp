#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int total_gas=0;
        int total_cost=0;
        for(int i=0; i<gas.size(); ++i) {
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_gas<total_cost) return -1;

        int start_idx=0;
        int gas_tank=0;
        for(int i=0; i<gas.size(); ++i) {
            gas_tank+=gas[i]-cost[i];
            if(gas_tank<0) {
                start_idx=i+1;
                gas_tank=0;
            }
        }
        return start_idx;
    }
};
