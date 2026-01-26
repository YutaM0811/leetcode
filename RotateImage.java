import java.util.*;

class RorateImage {
    public void rotate(int[][] matrix) {
        int[][] d=matrix;
        int n2=matrix[0].length-1;
        for(int i=0; i<d.length; i++) {
            int n1=matrix.length-1;
            for(int j=0; i<d[i].length; j++) {
                matrix[n1][n2]=d[i][j];
                n1--;
            }
            n2--;
        }
    }
}
