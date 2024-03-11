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
			int loopLen = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < loopLen; i++) {
				String s = br.readLine();
				int lastIndex = s.length() - 1; 
				sb.append(s.charAt(0));
				sb.append(s.charAt(lastIndex));
				bw.write(sb.toString());
				bw.newLine();
				sb.setLength(0);
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
