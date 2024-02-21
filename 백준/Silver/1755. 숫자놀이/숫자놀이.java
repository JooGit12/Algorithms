import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);

        String[] numEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        TreeMap<String, Integer> map = new TreeMap<>();

        StringBuilder sb = new StringBuilder();
        
        for (int i = start; i <= end; i++) {
            if (i < 10) {
                map.put(numEng[i], i);
            } else {
                sb.append(numEng[i / 10]);
                sb.append(' ');
                sb.append(numEng[i % 10]);
                map.put(sb.toString(), i);
                sb.setLength(0);
            }
        }

        int count = 0;
        for (String key : map.keySet()) {
            bw.write(map.get(key) + " ");
            count++;
            if (count % 10 == 0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
