import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        
        int count = 1;
        while (B != A) {
            if (B < A) {
                System.out.println(-1);
                System.exit(0);
            }
            
            if (B % 10 == 1) {
                B /= 10;
            } else if (B % 2 == 0) {
                B /= 2;
            } else {
                System.out.println(-1);
                System.exit(0);
            }
            count++;
        }
        
        System.out.print(count);
        
        reader.close();
    }
}
