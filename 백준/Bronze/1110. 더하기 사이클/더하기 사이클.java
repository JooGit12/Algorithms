import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getCycleCount(n));
	}
	
	private static int getCycleCount(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int answer = n;
		int newNum = 0;
		int count = 0;
		
		while (newNum != n) {
			newNum = answer;
			count++;
			n = (n < 10) ? (n * 10 + n) : ((n % 10) * 10 + ((n % 10) + (n / 10)) % 10);
		}
		
		return count;
	}
}
