class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int m=-1;
        for(int i=arr.size()-1; i>=0; i--) {
            int c=arr[i];
            arr[i]=m;
            if(m<c) m=c;
        }
        return arr;
    }
};
