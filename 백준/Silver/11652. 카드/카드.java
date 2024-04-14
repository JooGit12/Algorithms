import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Integer> cards = new HashMap<>();
        Long N = Long.parseLong(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            long card = Long.parseLong(reader.readLine());
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }
        
        List<Map.Entry<Long, Integer>> cardList = new ArrayList<>(cards.entrySet());
        cardList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            } else {
                return b.getValue().compareTo(a.getValue());
            }
        });
        
        Map.Entry<Long, Integer> lastEntry = cardList.get(0);
        
        System.out.println(lastEntry.getKey());
    }
}
