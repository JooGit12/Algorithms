import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> scovilleHeap = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));
        
        int answer = 0;
        
        int minScoville = scovilleHeap.peek();
        while (k > minScoville && scovilleHeap.size() > 1) {
            
            int scoville1 = scovilleHeap.poll();
            int scoville2 = scovilleHeap.poll();
            scovilleHeap.offer(scoville1 + (scoville2 * 2));
            minScoville = scovilleHeap.peek();
            
            answer++;
        }
        
        return (k > minScoville) ? - 1 : answer;
    }
}
