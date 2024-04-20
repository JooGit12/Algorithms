import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        System.out.println(factorial(N));
    }
    
    private static int factorial (int n) {
        if (n < 2) return 1; // 종료 지점
        return n * factorial(n - 1);
    }
}
