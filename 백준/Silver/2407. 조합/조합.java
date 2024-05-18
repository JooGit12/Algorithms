import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(tokens.nextToken());
        int m = Integer.parseInt(tokens.nextToken());
        
        BigInteger result = combination(n, m);
        
        System.out.println(result);
    }
    
    public static BigInteger combination(int n, int m) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(m).multiply(factorial(n - m));    
        return numerator.divide(denominator);
    }
    
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
}
