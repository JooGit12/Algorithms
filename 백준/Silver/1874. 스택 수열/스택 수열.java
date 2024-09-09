import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder builder = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());
        
        int[] stack = new int[N];
        
        int idx = 0;
        int start = 0;
        
        while (N --> 0) {
            int value = Integer.parseInt(reader.readLine());
            
            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack[idx] = i;
                    idx++;
                    builder.append('+').append('\n');
                }                
                start = value;
            }
            
            else if (stack[idx - 1] != value) {
                System.out.print("NO");
                return;
            }
            
            idx--;
            builder.append('-').append('\n');
        }
        System.out.println(builder);
    }
}
