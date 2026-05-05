# include <iostream>
using namespace std;

int main() {
    int T,X;
    cin>>T>>X;

    int m=0;
    for(int i=0; i<=T; ++i) {
        int n=0;
        cin>>n;
        if(i==0) {
            m=n;
            cout<<i<<" "<<n<<endl;
            continue;
        }
        if(abs(m-n)>=X) {
            m=n;
            cout<<i<<" "<<n<<endl;
        }
    }
    return 0;
}
