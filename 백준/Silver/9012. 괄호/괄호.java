import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            String vps = reader.readLine();
            writer.append(isVPS(vps)).append("\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
    
    private static String isVPS(String vps) {
        Stack<Character> stack = new Stack<>();        
        for (int j = 0; j < vps.length(); j++) {
            if (vps.charAt(j) == '(') {
                stack.add('(');
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else {
                return "NO";
            }
        }
        return (stack.isEmpty()) ? "YES" : "NO";
    }
}
