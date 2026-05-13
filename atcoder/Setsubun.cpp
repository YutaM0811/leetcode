# include <iostream>
using namespace std;

int main() {
    int N,K;
    cin>>N>>K;
    
    int n=0,c=-1;
    while(n<K) {
        n+=N;
        ++N;
        ++c;
    }
    cout<<c<<endl;
    return 0;
}
