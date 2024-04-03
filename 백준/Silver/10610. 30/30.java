import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		System.out.println(isMirco(input));
	}

	private static String isMirco(String input) {
		if (!input.contains("0")) return "-1";

		char[] inputs = input.toCharArray();
		Arrays.sort(inputs);
		StringBuilder builder = new StringBuilder();

		int answer = 0;
		for (char c : inputs) {
			answer += c - 48;
			builder.append(c);
		}

		return (answer % 3 == 0) ? builder.reverse().toString() : "-1";
	}
}
