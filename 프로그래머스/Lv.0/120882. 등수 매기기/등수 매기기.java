import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> sumList = new ArrayList<>();  
        
        for (int[] scoreSum : score) {
			sumList.add(scoreSum[0] + scoreSum[1]);
		}
        
        sumList.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = sumList.indexOf(score[i][0] + score[i][1]) + 1;
		}
        
        return answer;
    }
}
