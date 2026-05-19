# include <bits/stdc++.h>
using namespace std;

int Q;
multiset<int> m;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin>>Q;
    for(int i=0; i<Q; ++i) {
        int q,h;
        cin>>q>>h;
        if(q==1) m.insert(h);
        else {
            auto it=m.upper_bound(h);
            m.erase(m.begin(),it);
        }
        cout<<m.size()<<endl;
    }
    return 0;
}
