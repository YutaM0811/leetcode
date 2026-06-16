#include <bits/stdc++.h>
using namespace std;

class TimeMap {
public:
    map<string, vector<pair<int, string>>> store;

    TimeMap() {
        store.clear();
    }
    
    void set(string key, string value, int timestamp) {
        store[key].push_back({timestamp, value});
    }
    
    string get(string key, int timestamp) {
        if(store.find(key) == store.end()) return "";
        auto p=make_pair(timestamp, string("\xff"));
        auto it=upper_bound(store[key].begin(), store[key].end(), p);
        if(it==store[key].begin()) return "";
        --it;
        return it->second;
    }
};
