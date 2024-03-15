import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");

		String a = inputs[0];
		String b = inputs[1];

		int aLen = a.length();
		int answer = Integer.MAX_VALUE;

		for (int i = 0; i <= b.length() - aLen; i++) {
			int count = 0;
			for (int j = 0; j < aLen; j++) {
				if (a.charAt(j) != b.charAt(i + j)) count++;
			}
			answer = Math.min(answer, count);
		}

		System.out.println(answer);

		br.close();
	}
}
