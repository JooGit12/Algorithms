import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int[] fiboArr = new int[N + 1];
        
        System.out.println(fibo(N, fiboArr));
        
        reader.close();
    }
    
    private static int fibo(int n, int[] fiboArr) {
                
        for (int i = 0; i < fiboArr.length; i++) {
            if (i == 0) fiboArr[0] = 0;
            else if (i == 1) fiboArr[1] = 1;
            else fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
        }
        
        return fiboArr[n];
    }
}
