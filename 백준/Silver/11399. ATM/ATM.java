import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		
		int len = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split(" ");
		int[] intInputs = new int [len];
		
		for (int i = 0; i < intInputs.length; i++) {
			intInputs[i] = Integer.parseInt(inputs[i]);
		}
		
		Arrays.sort(intInputs);
		
		for (int i = 0; i < intInputs.length; i++) {
			answer += intInputs[i] * len--;
		}
		
		System.out.println(answer);
	}
}
