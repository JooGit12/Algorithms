import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			while (true) {
				int num = Integer.parseInt(br.readLine());
				if (num == -1)
					break;

				bw.write(isPerfectNum(num));
				bw.newLine();
			}

			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String isPerfectNum(int n) {
		int sum = 0;
		StringBuilder divisors = new StringBuilder();
		StringBuilder answer = new StringBuilder();

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				if (divisors.length() > 0)
					divisors.append(" + ");
				divisors.append(i);
			}
		}

		if (sum == n) {
			answer.append(n).append(" = ").append(divisors);
		} else {
			answer.append(n).append(" is NOT perfect.");
		}

		return answer.toString();
	}
}
