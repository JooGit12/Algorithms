import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int count = 0;
        
        for (int i = 1; i * (i + 1) / 2 <= N; i++) {
            if ((2 * N - i * (i - 1)) % (2 * i) == 0) count++;
        }
        
        System.out.println(count);
        reader.close();
    }
}
