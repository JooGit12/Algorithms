import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> set = new HashSet<>();
        
        int count = 0;
        for (int num : arr) {
            if (set.add(num)) {
                answer[count++] = num;
                if (count == k) {
                    break;
                }
            }
        }
        
        while (count < k) {
            answer[count++] = -1;
        }
        
        return answer;
    }
}
