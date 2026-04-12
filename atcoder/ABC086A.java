import java.util.*;

class ABC086A {
    public static void main(String[] args) {
        System.out.println(executer(new Scanner(System.in)));
    }

    private static String executer(Scanner sc) {
        int a=sc.nextInt(),b=sc.nextInt();
        if(a*b%2==0) return "Even";
            return "Odd";
    }
}
