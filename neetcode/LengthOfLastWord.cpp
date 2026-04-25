#include <sstream>
#include <string>
#include <vector>

class Solution {
public:
    int lengthOfLastWord(string s) {
        std::stringstream ss(s);
        std::string w;
        std::vector<std::string> v;
        while(ss>>w) {
            v.push_back(w);
        }
        w=v[v.size()-1];
        return w.length();
    }
};
