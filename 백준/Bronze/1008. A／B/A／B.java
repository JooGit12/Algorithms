import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] stringNums = br.readLine().split(" ");
		
		double answer = Double.parseDouble(stringNums[0]) / Double.parseDouble(stringNums[1]);
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
