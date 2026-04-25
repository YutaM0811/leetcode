#include <iostream>

using namespace std;
int main() {
    int N,Y;
    cin>>N>>Y;
    int m,fk,ok;
    m=Y/10000<N ?Y/10000 :N;
    fk=Y/5000<N ?Y/5000 :N;
    ok=Y/1000<N ?Y/1000 :N;
    int x,y,z;
    for(int i=0; i<=m; ++i) {
        for(int j=0; j<=fk; ++j) {
            x=10000*i;
            y=5000*j;
            z=1000*(N-i-j);
            if(x+y+z==Y && i+j<=N) {
                cout<<i<<" "<<j<<" "<<N-i-j<<endl;
                return 0;
            }
        }
    }
    cout<<-1<<" "<<-1<<" "<<-1<<endl;
    return 0;
}
