import java.util.*;

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i;
            while (true) { 
                if (n % 10 == 0) break;
                if (i % (n % 10) != 0) break;
                n = n / 10;
                if (n == 0) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
