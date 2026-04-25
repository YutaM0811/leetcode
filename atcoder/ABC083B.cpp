#include <iostream>
#include <vector>

using namespace std;
int main() {
    int N,A,B;
    cin>>N>>A>>B;
    vector<int> list;
    for(int i=N; i>=0; --i) {
        int n=0;
        int t=i;
        while(t>0) {
            n+=t%10;
            t/=10;
        }
        if(n>=A && n<=B) list.push_back(i);
    }
    int c=0;
    for(int i=0; i<list.size(); ++i) {
        c+=list[i];
    }
    cout<<c<<endl;
    return 0;
}
