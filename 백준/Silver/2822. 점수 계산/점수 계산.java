import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int[] scores = new int[8];

			for (int i = 0; i < 8; i++) {
				scores[i] = Integer.parseInt(br.readLine());
			}

			int[] sortedScores = Arrays.copyOf(scores, 8);
			Arrays.sort(sortedScores);

			int[] top5 = new int[5];

			StringBuilder sb = new StringBuilder();

			int scoreSum = 0;
			int count = 0;
			for (int i = 3; i < 8; i++) {
				scoreSum += sortedScores[i];
				for (int j = 0; j < 8; j++) {
					if (sortedScores[i] == scores[j]) {
						top5[count++] = j + 1;
					}
				}
			}

			Arrays.sort(top5);

			for (int i = 0; i < 5; i++) {
				sb.append(top5[i]);
				if (i < 4)
					sb.append(' ');
			}

			bw.write(Integer.toString(scoreSum));
			bw.newLine();
			bw.write(sb.toString());

			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
