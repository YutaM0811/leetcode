# include <iostream>
# include <vector>
# include <string>
using namespace std;

int main() {
    int N,m=0;
    cin>>N;
    vector<string> v(N);
    for(int i=0; i<N; ++i) {
        string s;
        cin>>s;
        if(m<s.length()) m=s.length();
        v[i]=s;
    }
    for(int i=0; i<v.size(); ++i) {
        string s=v[i],r="";
        int n=(m-s.length())/2;
        for(int j=0; j<n; ++j) r+=".";
        r+=s;
        for(int j=0; j<n; ++j) r+=".";
        cout<<r<<endl;
    }
    return 0;
}
