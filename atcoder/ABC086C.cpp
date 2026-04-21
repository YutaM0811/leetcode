#include <iostream>
#include <vector>
#include <map>
#include <cstdlib>
using namespace std;

int main() {
    int N,tp=0,xp=0,yp=0;
    map<int,vector<int>> m;
    cin>>N;
    for(int i=0; i<N; ++i) {
        int t,x,y;
        cin>>t>>x>>y;
        m[i]={t,x,y};
    }
    for(int i=0; i<N; ++i) {
        vector<int>& v=m[i];
        int dt=v[0]-tp;
        int dist=abs(v[1]-xp)+abs(v[2]-yp);
        if(dt>=dist&&(dt-dist)%2==0) {
            tp=v[0];
            xp=v[1];
            yp=v[2];
            continue;
        }
        cout<<"NO"<<endl;
        return 0;
    }
    cout<<"YES"<<endl;
    return 0;
}
