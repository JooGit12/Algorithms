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
            int answer = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
            
            bw.write(String.valueOf(answer));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
