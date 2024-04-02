import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long S = Long.parseLong(reader.readLine());
		long N = (long)(Math.sqrt(1 + 8*S) - 1) / 2;
		
		System.out.println(N);
	}
}
