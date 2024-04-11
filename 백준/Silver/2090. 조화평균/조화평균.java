import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        long[] inputs = Arrays.stream(reader.readLine().split(" "))
                            .mapToLong(Long::parseLong)
                            .toArray();
        
        long lcm = lcm(inputs, n);
        
        long numeratorSum = 0;
        for (int i = 0; i < n; i++) {
            numeratorSum += lcm / inputs[i];
        }

        long gcd = findGcd(lcm, numeratorSum);
        
        System.out.println((lcm / gcd) + "/" + (numeratorSum / gcd));
    }
    
    public static long lcm(long[] array, int n) {
        long result = array[0];
        for (int i = 1; i < n; i++)
            result = (((array[i] * result)) / (findGcd(array[i], result)));
        return result;
    }
    
    public static long findGcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
