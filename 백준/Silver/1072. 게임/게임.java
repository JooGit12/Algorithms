import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = -1, y = -1;
        try {
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
        } catch (NumberFormatException e) {

        }
        int z = getPercent(x, y);

        int ans = binarySearch(x, y, z);
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }

    static int binarySearch(int x, int y, int z) {
        int ans = -1;
        int left = 0;
        int right = (int) 1e9;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (getPercent(x + mid, y + mid) != z) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    static int getPercent(int x, int y) {
        return (int) ((long) y * 100 / x);
    }
}
