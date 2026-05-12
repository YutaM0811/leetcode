# include <iostream>
using namespace std;

int main() {
    int N,K;
    cin>>N>>K;

    int c=0;
    for(int i=0; i<=N; ++i) {
        int n=i, r=0;
        while(n>0) {
            int d=n%10;
            r+=d;
            if(d==0&&n<10) r+=n;
            n/=10;
        }
        if(r==K) ++c;
    }
    cout<<c<<endl;
    return 0;
}
