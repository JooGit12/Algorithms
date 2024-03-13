import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			String[] inputs = br.readLine().split(" ");
			int[] inputNums = new int[5];

			for (int i = 0; i < 5; i++) {
				inputNums[i] = Integer.parseInt(inputs[i]);
			}

			int answer = Integer.MAX_VALUE;
			for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 5; j++) {
					for (int k = j + 1; k < 5; k++) {
						int lcm = getLcm(inputNums[i], getLcm(inputNums[j], inputNums[k]));
						answer = Math.min(lcm, answer);
					}
				}
			}

			bw.write(Integer.toString(answer));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int getGcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	private static int getLcm(int a, int b) {
		return a * (b / getGcd(a, b));
	}
}
