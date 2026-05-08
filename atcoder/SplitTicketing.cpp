# include <iostream>
# include <vector>
using namespace std;

int main() {
    int N;
    cin>>N;
    
    vector<vector<long long>> v(N+1,vector<long long>(N+1));
    for(int i=0; i<N; ++i) {
        for(int j=i+1; j<N; ++j) {
            cin>>v[i][j];
        }
    }
    for(int a=0; a<N; ++a) {
        for(int b=a+1; b<N; ++b) {
            for(int c=b+1; c<N; ++c) {
                if(v[a][c]>v[a][b]+v[b][c]) {
                    cout<<"Yes"<<endl;
                    return 0;
                }
            }
        }
    }
    cout<<"No"<<endl;
    return 0;
}
