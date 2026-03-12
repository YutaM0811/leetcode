#include <algorithm>
#include <cctype>

class Solution {
public:
    bool isPalindrome(string s) {
        int l=0,r=s.length()-1;
        while(l<r) {
            if(!std::isalnum(static_cast<unsigned char>(s[l]))) l++;
            else if(!std::isalnum(static_cast<unsigned char>(s[r]))) r--;
            else{
                if(std::tolower(static_cast<unsigned char>(s[l])) !=
                        std::tolower(static_cast<unsigned char>(s[r]))) return false;
                l++;
                r--;
            }
        }
        return true;
    }
};
