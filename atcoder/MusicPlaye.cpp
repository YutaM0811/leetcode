# include <iostream>
using namespace std;

int main() {
    int Q;
    cin>>Q;

    int v=0;
    bool onM=false;
    for(int i=0; i<Q; ++i) {
        int A;
        cin>>A;
        if(A==1) ++v;
        if(A==2&&v>0) --v;
        if(A==3) {
            if(onM) onM=false;
            else onM=true;
        }
        if(v>=3&&onM) cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
    }
    return 0;
}

