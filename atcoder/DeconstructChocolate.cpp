# include <iostream>
using namespace std;

int main() {
    int H,W,Q;
    cin>>H>>W>>Q;
    for(int i=0; i<Q; ++i) {
        int q,r;
        cin>>q>>r;
        if(q==1) {
            cout<<r*W<<endl;
            H-=r;
        } else {
            cout<<r*H<<endl;
            W-=r;
        }
    }
    return 0;
}
