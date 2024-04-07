import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int[] solution(String[] operations) {
		int[] answer = {0, 0};
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < operations.length; i++) {
			String[] operation = operations[i].split(" ");
			
			if (operation[0].equals("I")) {
				minHeap.offer(Integer.parseInt(operation[1]));
				maxHeap.offer(Integer.parseInt(operation[1]));
			} else if (!minHeap.isEmpty()) {
				if (operation[1].equals("-1")) {
					int min = minHeap.poll();
					maxHeap.remove(min);
				} else {
					int max = maxHeap.poll();
					minHeap.remove(max);
				}
			}
		}
		
		if (!minHeap.isEmpty()) {
			answer[0] = maxHeap.poll();
			answer[1] = minHeap.poll();
		}
		
		return answer;
	}
}
