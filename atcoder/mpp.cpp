# include <iostream>
# include <string>
# include <vector>
# include <algorithm>
using namespace std;

int main() {
    string S;
    cin>>S;

    vector<int> v(26);
    int m=0;
    for(int i=0; i<S.length(); ++i) {
        char c=S[i];
        ++v[c-'a'];
        if(m<v[c-'a']) m=v[c-'a'];
    }
    for(int i=0; i<v.size(); ++i) {
        if(m>v[i]) continue;
        char c=i+'a';
        S.erase(remove(S.begin(),S.end(),c),S.end());
    }
    cout<<S<<endl;
    return 0;
}
