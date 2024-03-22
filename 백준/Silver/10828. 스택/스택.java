import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> inputsStack = new Stack<>();

        int inputsLen = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputsLen; i++) {
            String input = br.readLine();
            if (input.contains("push")) {
                String[] pushArr = input.split(" ");
                inputsStack.push(pushArr[1]);
            } else if (input.equals("pop")) {
                if (!inputsStack.empty()) {
                    bw.append(inputsStack.pop()).append("\n");
                } else {
                    bw.append("-1\n");
                }
            } else if (input.equals("size")) {
                bw.append(Integer.toString(inputsStack.size())).append("\n");
            } else if (input.equals("empty")) {
                bw.append((inputsStack.empty()) ? "1\n" : "0\n");
            } else if (input.equals("top")) {
                if (!inputsStack.empty()) {
                    bw.append(inputsStack.peek()).append("\n");
                } else {
                    bw.append("-1\n");
                }
            }
        }

        inputsStack.clear();
        bw.flush();
        bw.close();
        br.close();
    }
}
