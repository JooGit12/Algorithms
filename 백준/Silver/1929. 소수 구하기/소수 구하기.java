import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			for (int i = start; i <= end; i++) {
				if (isPrimeNum(i)) {
					bw.write(Integer.toString(i));
					bw.newLine();
				}
			}

			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean isPrimeNum(int num) {

		if (num < 2) return false;
		
		if (num == 2) return true;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}

		return true;
	}
}
