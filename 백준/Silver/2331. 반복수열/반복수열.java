import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        
        int A = Integer.parseInt(token.nextToken());
        int P = Integer.parseInt(token.nextToken());
        
        writer.write(Integer.toString(getSequenceLen(A, P)));
        
        writer.flush();
        writer.close();
        reader.close();
    }

    public static int getSequenceLen(int A, int P) {
        Map<Integer, Integer> sequenceIndex = new HashMap<>();
        int currentNum = A;
        int index = 0;
        while (!sequenceIndex.containsKey(currentNum)) {
            sequenceIndex.put(currentNum, index);
            currentNum = getNextNum(currentNum, P);
            index++;
        }
        return sequenceIndex.get(currentNum);
    }
    
    public static int getNextNum(int num, int p) {
        int nextNum = 0;        
        while (num > 0) {
            int digit = num % 10;
            nextNum += Math.pow(digit, p);
            num /= 10;
        }
        return nextNum;
    }
    
}
