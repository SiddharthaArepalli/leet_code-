import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        BigInteger res = b1.multiply(b2);
        return res.toString();
    }
}