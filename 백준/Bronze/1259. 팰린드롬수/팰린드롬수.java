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

            while (!input.equals("0")) {
                StringBuilder sb = new StringBuilder(input);
                String reversedInput = sb.reverse().toString();

                if (input.equals(reversedInput)) {
                    bw.write("yes");
                    bw.newLine();
                } else {
                    bw.write("no");
                    bw.newLine();
                }

                input = br.readLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
