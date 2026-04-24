# include <iostream>
# include <unordered_set>
# include <vector>
using namespace std;

int main() {
    string M,D;
    unordered_set<string> set; 
    cin>>M>>D;
    vector<string> v={"17","33","55","77","99"};
    for(int i=0; i<v.size(); ++i) {
        set.insert(v[i]);
    }
    string std=set.insert(M+D).second ?"No" :"Yes";
    cout<<std<<endl;
    return 0;
}
