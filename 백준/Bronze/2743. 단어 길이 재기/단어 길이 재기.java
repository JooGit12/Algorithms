import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String input = br.readLine();
			
			bw.write(Integer.toString(input.length()));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
