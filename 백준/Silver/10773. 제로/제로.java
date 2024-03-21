import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> inputStack = new Stack<>();
		
		int answer = 0;
		int endIndex = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < endIndex; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input != 0) {
				inputStack.add(input);
			}else {
				inputStack.pop();
			}
		}
		
		for (Integer input : inputStack) {
			answer += input;
		}
		
		System.out.println(Integer.toString(answer));
	}
}
