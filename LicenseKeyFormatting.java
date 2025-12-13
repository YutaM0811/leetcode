import java.util.*;

class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') continue;
            sb.append(s.charAt(i));
        }

        int c = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            c++;
            if (c == k && i != 0) {
                sb.insert(i, "-");
                c = 0;
            }
        }
        return sb.toString().toUpperCase();
    }
}
