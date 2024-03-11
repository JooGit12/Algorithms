import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] input = br.readLine().split(" ");
			
			int uniqueNum = 0;
			
			for (int i = 0; i < input.length; i++) {
				int num = Integer.parseInt(input[i]);
				uniqueNum += num * num;
			}
			
			bw.write(Integer.toString(uniqueNum % 10));
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
