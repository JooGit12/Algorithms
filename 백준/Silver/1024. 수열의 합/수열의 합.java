import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        long N = Long.parseLong(tokenizer.nextToken());
        int L = Integer.parseInt(tokenizer.nextToken());

        boolean isFound = false;
        
        for (int len = L; len <= 100; len++) {
            long temp = N - (len * (len - 1) / 2);
            if (temp % len == 0 && temp / len >= 0) {
                long a = temp / len;
                for (int i = 0; i < len; i++) {
                    writer.write((a + i) + " ");
                }
                isFound = true;
                break;
            }
        }
        
        if (!isFound) writer.write("-1");
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
