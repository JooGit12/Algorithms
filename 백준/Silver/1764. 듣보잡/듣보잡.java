import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        
        HashSet<String> set = new HashSet<>();
        List<String> unListenedLookedList = new ArrayList<>();
        int unlistened = Integer.parseInt(tokens.nextToken());
        int unlooked = Integer.parseInt(tokens.nextToken());
        
        for (int i = 0; i < unlistened; i++) {
            set.add(reader.readLine());
        }
        
        for (int i = 0; i < unlooked; i++) {
            String unLookedPerson = reader.readLine();
            if (set.contains(unLookedPerson)) {
                unListenedLookedList.add(unLookedPerson);
            }
        }
        
        Collections.sort(unListenedLookedList);
        
        writer.append(Integer.toString(unListenedLookedList.size())).append("\n");
        for (int i = 0; i < unListenedLookedList.size(); i++) {
            writer.append(unListenedLookedList.get(i)).append("\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
