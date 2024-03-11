import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] inputs = br.readLine().split(" ");
			
			long a = Integer.parseInt(inputs[0]);
			long b = Integer.parseInt(inputs[1]);
			
			bw.write(Long.toString(a*a - b*b));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
