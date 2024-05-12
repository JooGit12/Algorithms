import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(reader.readLine());
        String[][] members = new String[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            members[i][0] = token.nextToken();
            members[i][1] = token.nextToken();            
        }
        
        Arrays.sort(members, (member1, member2) -> Integer.compare(Integer.parseInt(member1[0]), Integer.parseInt(member2[0])));

        for (int i = 0; i < N; i++) {
            writer.append(members[i][0] + " " + members[i][1] + "\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
