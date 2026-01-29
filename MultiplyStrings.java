import java.math.BigInteger;

class MultiplyStrings {
    public String multiply(String num1, String num2) {
        BigInteger r = new BigInteger(num1).multiply(new BigInteger(num2));
        return r.toString();
    }
}
