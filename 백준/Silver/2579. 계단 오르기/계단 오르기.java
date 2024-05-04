import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                
        int stairsLen = Integer.parseInt(reader.readLine());
        int[] scores = new int[stairsLen + 1];
        int[] dp = new int[stairsLen + 1];
        
        for (int i = 1; i <= stairsLen; i++) {
            scores[i] = Integer.parseInt(reader.readLine());
        }
        
        dp[1] = scores[1];
        
        if (stairsLen > 1) dp[2] = scores[1] + scores[2];
        
        for (int i = 3; i < scores.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + scores[i - 1]) + scores[i];
        }
        
        System.out.println(dp[stairsLen]);
        reader.close();
    }
}
