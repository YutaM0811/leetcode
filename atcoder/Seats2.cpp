# include <iostream>
using namespace std;

int main() {
    int N,M,s=0;
    cin>>N>>M;
    s=N%2==1 ?(N+1)/2 :N/2;
    if(s<M) cout<<"No"<<endl;
    else cout<<"Yes"<<endl;
    return 0;
}
