import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String X = reader.readLine();
        int count = 0;
        while (X.length() > 1) {
            int sum = 0;
            for (int i = 0; i < X.length(); i++) {
                sum += X.charAt(i) - '0';
            }
            X = Integer.toString(sum);
            count++;
        }
        
        int resultNum = Integer.parseInt(X);
        System.out.println(count);
        System.out.print((resultNum == 3 || resultNum == 6 || resultNum == 9) ? "YES" : "NO");
        
        reader.close();
    }
}
