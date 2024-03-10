import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] stringNums = br.readLine().split(" ");
            int a = Integer.parseInt(stringNums[0]);
            int b = Integer.parseInt(stringNums[1]);

            if (a > b) {
            	bw.write(">");
			}else if (a < b) {
				bw.write("<");
			}else {
				bw.write("==");
			}

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
