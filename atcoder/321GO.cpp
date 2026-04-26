# include <iostream>
using namespace std;

int main() {
    int N;
    cin>>N;
    for(int i=N; i>0; --i) {
        if(i==1) cout<<i;
        else cout<<i<<",";
    }
    cout<<endl;
    return 0;
}
