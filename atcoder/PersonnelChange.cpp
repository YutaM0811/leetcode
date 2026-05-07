# include <iostream>
# include <vector>
using namespace std;

int main() {
    int N,M;
    cin>>N>>M;

    vector<int> av(M),bv(M);
    for(int i=0; i<N; ++i) {
        int a,b;
        cin>>a>>b;
        ++av[a-1];
        ++bv[b-1];
    }
    for(int i=0; i<M; ++i) {
        cout<<bv[i]-av[i]<<endl;
    }
    return 0;
}
