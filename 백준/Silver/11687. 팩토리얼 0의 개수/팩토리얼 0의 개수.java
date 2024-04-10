import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static long countZeros(long n) {
        long count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static long findMinN(long m) {
        long left = 0, right = 5 * m;
        long result = -1;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (countZeros(mid) >= m) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return countZeros(result) == m ? result : -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long m = Long.parseLong(br.readLine());
        bw.write(Long.toString(findMinN(m)));
        bw.flush();
        bw.close();
        br.close();
    }
}
