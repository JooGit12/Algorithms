import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
            StringBuilder sb = new StringBuilder();
            
            String[] strNums = br.readLine().split(" ");
            String[] strNums2 = br.readLine().split(" ");
            
            int len = Integer.parseInt(strNums[0]);
            int max = Integer.parseInt(strNums[1]);
            boolean isFirst = true;
            
            for (int i = 0; i < len; i++) {
                if (Integer.parseInt(strNums2[i]) < max) {
                    if (!isFirst) {
                        sb.append(" ");
                    } else {
                        isFirst = false;
                    }
                    sb.append(strNums2[i]);
                }
            }
            
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
