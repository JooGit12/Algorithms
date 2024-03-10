import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
        	int len = Integer.parseInt(br.readLine());
        	String[] strNums = br.readLine().split(" ");
        	String n = br.readLine();
        	int answer = 0;
        	
        	for (int i = 0; i < len; i++) {
				if (strNums[i].equals(n)) {
					answer++;
				}
			}
        	
        	bw.write(String.valueOf(answer));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
