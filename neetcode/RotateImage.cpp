#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        vector<vector<int>> result(matrix.size(), vector<int>(matrix.size()));
        for(int i=0; i<matrix.size(); ++i) {
            for(int j=0; j<matrix[i].size(); ++j) {
                result[j][matrix.size()-1-i]=matrix[i][j];
            }
        }
        matrix=result;
    }
};
