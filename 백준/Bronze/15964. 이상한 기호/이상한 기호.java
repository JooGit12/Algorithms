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
			
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			
			bw.write(Integer.toString(a*a - b*b));
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
