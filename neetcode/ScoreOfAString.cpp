class Solution {
public:
    int scoreOfString(string s) {
        int c=0;
        for(int i=1; i<s.length(); i++) {
            int a=s[i-1];
            int b=s[i];
            int d=a-b;
            if(a-b<0) d=-d;
            c+=d;
        }
        return c;
    }
};
