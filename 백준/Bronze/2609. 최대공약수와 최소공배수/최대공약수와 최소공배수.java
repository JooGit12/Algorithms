import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(Integer.toString(calculateGCD(a, b)));
			bw.newLine();
			bw.write(Integer.toString(calculateLCM(a, b)));
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int calculateGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	private static int calculateLCM(int a, int b) {
		return a * b / calculateGCD(a, b);
	}
}
