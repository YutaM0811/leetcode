import java.util.*;

class RorateImage {
    public void rotate(int[][] matrix) {
        // Transpose
        for(int i=0; i<matrix.length; i++) {
            for(int j=i+1; j<matrix.length; j++) {
                int x=matrix[i][j];
                int y=matrix[j][i];
                matrix[i][j]=y;
                matrix[j][i]=x;
            }
        }
        // Switch
        for(int i=0; i<matrix.length; i++) {
            int l=0,r=matrix.length-1;
            while(l<r) {
                int x=matrix[i][l];
                int y=matrix[i][r];
                matrix[i][l]=y;
                matrix[i][r]=x;
                l++;
                r--;
            }
        }
    }
}
