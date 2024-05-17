import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        int[] dp = new int[11];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        
        for (int i = 0; i < T; i++) {
            writer.write(dp[Integer.parseInt(reader.readLine())] + "\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
