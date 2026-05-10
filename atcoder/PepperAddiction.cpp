# include <iostream>
# include <vector>
using namespace std;

int main() {
    int N,M;
    cin>>N>>M;

    vector<int> v(M);
    for(int i=0; i<M; ++i) {
        cin>>v[i];
    }
    int a=0;
    for(int i=0; i<N; ++i) {
        int m,g;
        cin>>m>>g;
        if(v[m-1]-g<0) {
            a+=v[m-1];
            v[m-1]=0;
            continue;
        } 
        a+=g;
        v[m-1]-=g;
    }
    cout<<a<<endl;
    return 0;
}
