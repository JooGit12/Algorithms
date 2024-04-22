import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(reader.readLine());
        
        int [][] fibonacci = new int [41][2];
        
        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;
        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;
        
        for (int j = 2; j <= 40; j++) {
            fibonacci[j][0] = fibonacci[j - 1][0] + fibonacci[j - 2][0];
            fibonacci[j][1] = fibonacci[j - 1][1] + fibonacci[j - 2][1];
        }
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());
            writer.write(fibonacci[N][0] + " " + fibonacci[N][1] + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
