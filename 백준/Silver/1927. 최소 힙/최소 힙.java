import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int N = Integer.parseInt(reader.readLine());

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(reader.readLine());
			if (x == 0) {
				writer.append((pq.isEmpty()) ? "0" : Integer.toString(pq.poll())).append("\n");
			} else {
				pq.offer(x);
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}
}
