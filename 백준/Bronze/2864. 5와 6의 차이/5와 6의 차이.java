import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        
        int minSum = getMin(A) + getMin(B);
        int maxSum = getMax(A) + getMax(B);
        
        System.out.println(minSum + " " + maxSum);
        reader.close();
    }
    
    private static int getMin(int num) {
        int minNum = 0;
        int factor = 1;
        
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            
            if (digit == 6) {
                digit = 5;
            }
            
            minNum += digit * factor;
            factor *= 10;
        }
        
        return minNum;
    }
    
    private static int getMax(int num) {
        int maxNum = 0;
        int factor = 1;
        
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            
            if (digit == 5) {
                digit = 6;
            }
            
            maxNum += digit * factor;
            factor *= 10;
        }
        
        return maxNum;
    }
}
