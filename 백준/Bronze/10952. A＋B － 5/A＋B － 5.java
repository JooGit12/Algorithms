import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			while (true) {
				String[] strArr = br.readLine().split(" ");
				
				if (strArr[0].equals("0") && strArr[1].equals("0")) break;
				
				int sum = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);				
				bw.write(String.valueOf(sum));
				bw.newLine();
			}
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
