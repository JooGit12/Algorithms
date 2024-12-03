import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder builder = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());
        
        Set<String> workers = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            String status = tokenizer.nextToken();
            
            if (status.equals("enter")) {
                workers.add(name);
            } else {
                workers.remove(name);
            }
           
        }
        
        List<String> sortedWorkers = new ArrayList<>(workers);
        Collections.sort(sortedWorkers, Collections.reverseOrder());
        
        for (String person : sortedWorkers) {
            builder.append(person).append("\n");
        }
        
        System.out.println(builder.toString());
    }
}
