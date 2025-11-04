import java.util.*;

class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

       while (true) {
         while (n > 0) {
             int digit = n % 10;
             n /= 10;
             sum = sum + digit * digit;
         }
         if (sum == 1) return true;
         if (set.contains(sum)) return false;
         set.add(sum);
         n = sum;
         sum = 0;
       } 
    }
}
