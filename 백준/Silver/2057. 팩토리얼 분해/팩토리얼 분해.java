import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(reader.readLine());
        long[] factorials = new long[21];
        if (N == 0) {
            System.out.println("NO");
            return;
        }

        factorials[0] = 1L;
        for (int i = 1; i <= 20; i++) {
            factorials[i] = factorials[i-1] * i;
        }

        for (int i = 20; i >= 0; i--) {
            if (N >= factorials[i]) {
                N -= factorials[i];
            }
        }

        if (N == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
