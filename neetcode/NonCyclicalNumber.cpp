class Solution {
public:
    bool isHappy(int n) {
        while(n!=1&&n!=4) {
            int c=0;
            while(n>0) {
                int d=n%10;
                c+=d*d;
                n/=10;
            }
            n=c;
        }
        return n==1;
    }
};
