import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long a, b, c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());

		bw.write(String.valueOf(power(a, b)));
		bw.flush();
		bw.close();
		br.close();
	}

	private static long power(long x, long y) {
		if (y == 0) {
			return 1;
		} else {
			long n = power(x, y / 2);
			long temp = n * n % c;
			return (y % 2 == 0) ? temp : temp * a % c;
		}
	}
	
}
