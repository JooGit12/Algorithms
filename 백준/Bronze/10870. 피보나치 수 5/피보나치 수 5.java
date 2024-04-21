import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        System.out.println(fibo(N));
        
        reader.close();
    }
    
    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}

