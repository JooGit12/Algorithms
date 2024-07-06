import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(reader.readLine());
        int[] S = new int[21];
        
        for (int i = 0; i < M; i++) {
            String[] calculation = reader.readLine().split(" ");
            String mode = calculation[0];
            if (mode.equals("add")) {
                S[Integer.parseInt(calculation[1])] = 1;
            } else if (mode.equals("remove")) {
                S[Integer.parseInt(calculation[1])] = 0;
            } else if (mode.equals("check")) {
                writer.append((S[Integer.parseInt(calculation[1])] == 1) ? "1" : "0").append("\n");
            } else if (mode.equals("toggle")) {
                int cal = Integer.parseInt(calculation[1]);
                S[cal] = (S[cal] == 1) ? 0 : 1;
            } else if (mode.equals("all")) {
                Arrays.fill(S, 1);
            } else {
                Arrays.fill(S, 0);
            }
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
