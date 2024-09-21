import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizerNK = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(tokenizerNK.nextToken());
        int K = Integer.parseInt(tokenizerNK.nextToken());
        int[] weights = new int[N];
        int[] values = new int[N];
        int[] dp = new int[K + 1];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            weights[i] = Integer.parseInt(tokenizer.nextToken());
            values[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = K; j >= weights[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
            }
        }
        
        System.out.print(dp[K]);
        reader.close();
    }
}
