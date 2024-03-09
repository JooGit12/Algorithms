import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] heights = br.readLine().split(" ");

        int maxRise = 0;
        int currentRise = 0;

        for (int i = 0; i < n - 1; i++) {
            int currentHeight = Integer.parseInt(heights[i]);
            int nextHeight = Integer.parseInt(heights[i + 1]);

            if (nextHeight > currentHeight) {
                if (currentRise == 0) {
                    currentRise = nextHeight - currentHeight;
                } else {
                    currentRise += nextHeight - currentHeight;
                }
            } else {
                if (currentRise > maxRise) {
                    maxRise = currentRise;
                }
                currentRise = 0;
            }
        }

        if (currentRise > maxRise) {
            maxRise = currentRise;
        }

        bw.write(Integer.toString(maxRise));
        bw.flush();

        br.close();
        bw.close();
    }
}
