import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> cards = new LinkedList<>();

        int N = Integer.parseInt(reader.readLine());
        
        for (int i = 1; i <= N; i++) {
            cards.offer(i);
        }

        while (cards.size() > 1) {
            cards.remove();
            cards.offer(cards.poll());
        }

        System.out.println(cards.poll());
        reader.close();
    }
}
