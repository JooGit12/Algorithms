import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(reader.readLine());
		int answer = 0;
		
		PriorityQueue<Integer> cards = new PriorityQueue<>();
		
		for (int i = 0; i < len; i++) {
			cards.offer(Integer.parseInt(reader.readLine()));
		}
		
		while (cards.size() > 1) {
			int cardsNum = cards.poll() + cards.poll();
			cards.offer(cardsNum);
			answer += cardsNum;
		}
		
		System.out.println(answer);
	}
}
