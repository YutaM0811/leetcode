#include <iostream>
#include <unordered_set>

using namespace std;
int main() {
    int N;
    cin>>N;
    unordered_set<int> set;
    for(int i=0; i<N; ++i) {
        int v;
        cin>>v;
        set.insert(v);
    }
    cout<<set.size()<<endl;
    return 0;
}
