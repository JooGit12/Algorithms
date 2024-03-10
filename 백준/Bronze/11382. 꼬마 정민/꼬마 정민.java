import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputStrings = br.readLine().split(" ");
		
		long[] input = new long[3];
		
		for (int i = 0; i < 3; i++) {
			input[i] = Long.parseLong(inputStrings[i]);
		}
		
		long answer = input[0] + input[1] + input[2];
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
