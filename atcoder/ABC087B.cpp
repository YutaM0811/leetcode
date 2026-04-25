#include <iostream>

using namespace std;

int main() {
    int A,B,C,X;
    cin>>A>>B>>C>>X;
    int a=0;
    for(int i=0; i<=A; ++i) {
        for(int j=0; j<=B; ++j) {
            for(int k=0; k<=C; ++k) {
                int c=500*i+100*j+50*k;
                if(c==X) ++a;
            }
        }
    }
    cout<<a<<endl;
    return 0;
}
