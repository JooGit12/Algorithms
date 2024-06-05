import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int[] divisors = new int[N];
        
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            divisors[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(divisors);
        int answer = divisors[0] * divisors[N - 1];
        
        System.out.println(answer);
        
        reader.close();
    }
}
