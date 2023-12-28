import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					n /= i;
				}
				intList.add(i);
			}
		}
        
        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}
