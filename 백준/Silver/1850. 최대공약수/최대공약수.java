import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = br.readLine().split(" ");
		
		long a = Long.parseLong(inputs[0]);
		long b = Long.parseLong(inputs[1]);
		
		long gcd = getGCD(a, b);
		
		System.out.println("1".repeat((int)gcd));
		br.close();
	}
	
	private static long getGCD(long a, long b) {
		while (b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
