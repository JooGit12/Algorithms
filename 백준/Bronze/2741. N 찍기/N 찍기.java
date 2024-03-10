import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int year = Integer.parseInt(br.readLine());
            
            for (int i = 1; i <= year; i++) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
            
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
