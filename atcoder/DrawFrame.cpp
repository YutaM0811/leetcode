# include <iostream>
using namespace std;

int main() {
    int H,M;
    cin>>H>>M;
    for(int i=0; i<H; ++i) {
        for(int j=0; j<M; ++j) {
            if(i==0||i==H-1||j==0||j==M-1) cout<<"#";
            else cout<<".";
        }
        cout<<endl;
    }
    return 0;
}
