import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
			if (n % i == 0) intArr.add(i);
		}
        
        int [] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
