import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                     
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
            	String[] strNums = br.readLine().split(" ");
            	bw.write(String.valueOf(Integer.parseInt(strNums[0]) + Integer.parseInt(strNums[1])));
            	bw.newLine();
			}
            
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
