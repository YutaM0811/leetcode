#include <iostream>
#include <vector>
#include <algorithm>
#include <functional>

using namespace std;
int main() {
    int N,a=0,b=0;
    cin>>N;
    vector<int> l(N);
    for(int i=0; i<N; ++i) {
        cin>>l[i];
    }
    sort(l.begin(),l.end(),greater<int>());
    for(int i=0; i<N; ++i) {
        if(i%2==0) a+=l[i];
        else b+=l[i];
    }
    cout<<a-b<<endl;
    return 0;
}
