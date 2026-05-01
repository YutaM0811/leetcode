# include <iostream>
using namespace std;

int main() {
    int N,X;
    cin>>N>>X;
    for(int i=0; i<N; ++i) {
        int a=0;
        cin>>a;
        if(a<X) {
            cout<<"1"<<endl;
            X=a;
            continue;
        }
        cout<<"0"<<endl;
    }
    return 0;
}
