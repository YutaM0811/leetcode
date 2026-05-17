# include <vector>
# include <unordered_set>
using namespace std;

class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        // 行を確認
        for(int i=0; i<board.size(); ++i) {
            unordered_set<char> s;
            for(int j=0; j<board[i].size(); ++j) {
                char c=board[i][j];
                if(c=='.') continue;
                if(s.contains(c)) return false;
                s.insert(c);
            }
        }
        // 列を確認
        for(int i=0; i<board.size(); ++i) {
            unordered_set<char> s;
            for(int j=0; j<board[i].size(); ++j) {
                char c=board[j][i];
                if(c=='.') continue;
                if(s.contains(c)) return false;
                s.insert(c);
            }
        }
        // 3*3ボックスを確認
        for(int i=0; i<board.size(); i+=3) {
            for(int j=0; j<board.size(); j+=3) {
                unordered_set<char> s;
                for(int k=i; k<i+3; ++k) {
                    for(int l=j; l<j+3; ++l) {
                        char c=board[k][l];
                        if(c=='.') continue;
                        if(s.contains(c)) return false;
                        s.insert(c);
                    }
                }
            }
        }
        return true;
    }
};
