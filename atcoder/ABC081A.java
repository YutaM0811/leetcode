import java.util.*;

class ABC081A {
    public static void main(String[] args) {
        System.out.println(execute(new Scanner(System.in)));
    }
    
    private static int execute(Scanner sc) {
        String s=sc.next();
        int c=0;
        for(int i=0; i<s.length(); ++i) {
            if(s.charAt(i)=='1') ++c;
        }
        return c;
    }
}
