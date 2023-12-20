import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger bigNum1 = new BigInteger(a);
        BigInteger bigNum2 = new BigInteger(b);
        
        return bigNum1.add(bigNum2).toString();
    }
}
