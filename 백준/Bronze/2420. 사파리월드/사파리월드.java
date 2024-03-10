import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] popularityArr = br.readLine().split(" ");

            long differPoppularity = Math.abs(Long.parseLong(popularityArr[0]) - Long.parseLong(popularityArr[1]));

            bw.write(String.valueOf(differPoppularity));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
