import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int candyWeight = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(getBags(candyWeight)));

		bw.flush();
		bw.close();
		br.close();
	}

	private static int getBags(int candyWeight) {
		
		int answer = 0;
		
		while (true) {
			if (candyWeight % 5 == 0) {
				answer += candyWeight / 5;
				break;
			}
			
			candyWeight -= 3;
			answer++;
			
			if (candyWeight < 0) {
				return -1;
			}
			
		}
		
		return answer;
	}
}
