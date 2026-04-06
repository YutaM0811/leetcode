#include <vector>

class Solution {
public:
    vector<int> countBits(int n) {
        std::vector<int> v;
        for(int i=0; i<=n; ++i) {
            int c=0;
            uint32_t b=static_cast<uint32_t>(i);
            for(int j=0; j<32; ++j) {
                if((b>>j)&1) ++c;
            }
            v.push_back(c);
        }
        return v;
    }
};
