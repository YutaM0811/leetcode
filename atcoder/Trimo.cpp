# include <iostream>
using namespace std;

int main() {
    int N;
    string S;
    cin>>N>>S;
    bool b=true;
    string s="";
    for(int i=0; i<N; ++i) {
        if(b&&'o'==S[i]) continue;
        b=false;
        s+=S[i];
    }
    cout<<s<<endl;
    return 0;
}
