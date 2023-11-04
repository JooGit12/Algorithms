import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ar = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % divisor == 0) {
				ar.add(arr[i]);
			}
		}
        
        if (ar.isEmpty()) {
			ar.add(-1);
		}
        
        Collections.sort(ar);
        return ar.stream().mapToInt(i -> i).toArray();
    }
}
