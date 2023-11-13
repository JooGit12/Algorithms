import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = intervals[0][0]; i < intervals[0][1] + 1; i++) {
			answer.add(arr[i]);
		}
        
        for (int i = intervals[1][0]; i < intervals[1][1] + 1; i++) {
			answer.add(arr[i]);
		}
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
