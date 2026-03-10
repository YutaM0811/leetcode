#include <iterator>

class Solution {
    public:
        bool isAnagram(string s, string t) {
            if(s.length()!=t.length()) return false;
            int sa[26]={0},ta[26]={0};
            for(int i=0; i<s.length(); i++) {
                sa[s[i]-'a']++;
                ta[t[i]-'a']++;
            }
            for(int i=0; i<std::size(sa); i++) {
                if(sa[i]!=ta[i]) return false;
            }
            return true;
         }
};
