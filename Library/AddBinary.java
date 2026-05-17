import java.util.*;

class AddBinary {
    public String addBinary(String s, String b) {

        int sl = s.length();
        int bl = b.length();
        int max = Math.max(sl, bl);

        while (s.length() < max) {
            s =  "0" + s;
        }

        while (b.length() < max) {
            b =  "0" + b;
        }

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = max -1; i >= 0; i--) {
            int x = s.charAt(i) - '0';
            int y = b.charAt(i) - '0';

            int sum = x + y + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    } 
}
