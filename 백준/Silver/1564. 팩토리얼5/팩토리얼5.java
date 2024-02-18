import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        long answer = 1L;
        int mod = 100000;
        int twoCount = 0, fiveCount = 0;

        for (int i = 1; i <= num; i++) {
            int temp = i;

            while (temp % 2 == 0) {
                twoCount++;
                temp /= 2;
            }

            while (temp % 5 == 0) {
                fiveCount++;
                temp /= 5;
            }

            answer = (answer * temp) % mod;
        }

        for (int i = 0; i < twoCount - fiveCount; i++) {
            answer = (answer * 2) % mod;
        }

        System.out.printf("%05d\n", answer);
    }
}
