import java.util.*;

class ABC081B {
    public static void main(String[] args) {
        System.out.println(execute(new Scanner(System.in)));
    }

    private static int execute(Scanner sc) {
        int n=sc.nextInt(),c=0,j=0;
        int[] a=new int[n];
        for(int i=0; i<n; ++i) {
            a[i]=sc.nextInt();
        }
        while(a[j]%2==0) {
            a[j]/=2;
            if(j==n-1) {
                ++c;
                j=0;
                continue;
            }
            ++j;
        }
        return c;
    }
}
