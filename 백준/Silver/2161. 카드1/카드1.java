import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		StringBuilder trashCards = new StringBuilder();
		
		while (q.size() > 1) {
			trashCards.append(q.poll()).append(" ");
			q.offer(q.poll());
		}
		
		writer.write(trashCards.toString() + q.poll());
		writer.flush();
		writer.close();
		reader.close();
	}
}
