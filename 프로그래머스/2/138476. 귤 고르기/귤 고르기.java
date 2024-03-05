import java.util.PriorityQueue;

class Solution {
    public int solution(int k, int[] tangerine) {
        int[] count = new int[10000001];
        for (int i : tangerine) {
            count[i]++;
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> count[b] - count[a]);
        for (int i = 1; i < 10000001; i++) {
            if (count[i] > 0) {
                queue.add(i);
            }
        }

        int result = 0;
        while (k > 0) {
            int n = queue.poll();
            result++;
            k -= count[n];
        }

        return result;
    }
}
