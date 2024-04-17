import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = reader.readLine().split(" ");
        
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int N = Integer.parseInt(inputs[2]);
        
        A %= B;
        for (int i = 0; i < N - 1; i++) {
            A *= 10;
            A %= B;
        }
        
        A *= 10;
        System.out.println(A / B);
    }
}
