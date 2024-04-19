import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
 
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(reader.readLine());
 
        writer.write((int)(Math.pow(2, N) - 1) + "\n");
 
        Hanoi(N, 1, 2, 3);
        
        writer.flush();
        writer.close();
    }
 
    public static void Hanoi(int N, int start, int mid, int end) throws IOException {
        if (N == 1) {
            writer.write(start + " " + end + "\n");
            return;
        }
 
        Hanoi(N - 1, start, end, mid);
    
        writer.write(start + " " + end + "\n");
    
        Hanoi(N - 1, mid, start, end);
 
    }
}
