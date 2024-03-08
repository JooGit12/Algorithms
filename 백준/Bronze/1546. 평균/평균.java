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

        int[] grades = new int[n];
        String[] inputGrades = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            grades[i] = Integer.parseInt(inputGrades[i]);
        }

        int maxScore = grades[0];
        for (int i = 1; i < n; i++) {
            if (grades[i] > maxScore) {
                maxScore = grades[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            double calculatedScore = (double) grades[i] / maxScore * 100;
            sum += calculatedScore;
        }

        double newAverage = sum / n;

        bw.write(String.valueOf(newAverage));
        bw.flush();
        bw.close();
        br.close();
    }
}
