import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
			if (n % i == 0) intArr.add(i);
		}
        
        return intArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
