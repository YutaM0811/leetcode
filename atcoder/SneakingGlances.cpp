# include <iostream>
# include <algorithm>
using namespace std;

int N;
int max_count;
long long L[25];

void recursion(double p, int i, int c) {
    if(i==N) {
        max_count=max(max_count,c);
        return;
    }

    double np=p+L[i];
    int pass=(p*np<0)?1:0;
    recursion(np,i+1,c+pass);

    double nn=p-L[i];
    int pass_n=(p*nn<0)?1:0;
    recursion(nn,i+1,c+pass_n);
}

int main() {
    cin>>N;
    for(int i=0; i<N; ++i) cin>>L[i];
    recursion(0.5,0,0);
    cout<<max_count<<endl;
    return 0;
}
