import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb = new StringBuilder();
			String input = br.readLine();
			
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				sb.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
			}
			
			bw.write(sb.toString());
			sb.setLength(0);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
