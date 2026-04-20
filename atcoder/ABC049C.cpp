#include <iostream>
#include <vector>

using namespace std;
int main() {
    string S;
    cin>>S;
    vector<string> v={"dream","dreamer","erase","eraser"};
    int p=S.length();
    while(p>0) {
        bool m=false;
        for(int i=0; i<v.size(); ++i) {
            string s=v[i];
            int l=s.length();
            if(p>=l&&s==S.substr(p-l,l)) {
                p-=l;
                m=true;
                break;
            }
        }
        if(!m) {
            cout<<"NO"<<endl;
            return 0;
        }
    }
    cout<<"YES"<<endl;
    return 0;
}
