import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<String> inputStack = new Stack<>();
		int N = Integer.parseInt(reader.readLine());

		for (int i = 0; i < N; i++) {
			String input = reader.readLine();
			if (input.startsWith("1 ")) {
				inputStack.push(input.substring(2));
			} else if (input.equals("2")) {
				writer.append((inputStack.isEmpty()) ? "-1" : inputStack.pop()).append("\n");
			} else if (input.equals("3")) {
				writer.append(Integer.toString(inputStack.size())).append("\n");
			} else if (input.equals("4")) {
				writer.append(inputStack.isEmpty() ? "1" : "0").append("\n");
			} else {
				writer.append(inputStack.isEmpty() ? "-1" : inputStack.peek()).append("\n");
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}
}
