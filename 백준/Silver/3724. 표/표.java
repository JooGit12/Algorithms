import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
        int t = Integer.parseInt(reader.readLine());
        
        StringBuilder builder = new StringBuilder();
        while(t --> 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int m = Integer.parseInt(tokenizer.nextToken()), n = Integer.parseInt(tokenizer.nextToken());
            
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for(int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }
            
            BigInteger max = BigInteger.ZERO;
            int answer = 1;
            for(int i = 0; i < m; i++) {
                BigInteger sum = BigInteger.ONE;
                for(int j = 0; j < n; j++) {
                    sum = sum.multiply(BigInteger.valueOf(arr[j][i]));
                }
                
                if(i == 0) {
                    max = sum;
                    continue;
                }
                
                if(sum.compareTo(max) == 1) {
                    max = sum;
                    answer = i + 1;
                }
                else if(sum.compareTo(max) == 0) {
                    answer = i + 1;
                }
            }
            builder.append(answer).append("\n");
        }
        System.out.print(builder);
    }
}
