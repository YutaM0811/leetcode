#include <vector>
#include <algorithm>

class KthLargest {
public:
    inline static int n;
    inline static std::vector<int> v;

    KthLargest(int k, vector<int>& nums) {
        n=k-1;
        v=nums;
    }
                
    int add(int val) {
        v.push_back(val);
        std::sort(v.rbegin(),v.rend());
        return v[n];
    }
};
