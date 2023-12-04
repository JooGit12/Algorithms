import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
    	intArr.add(arr[0]);
    	
        for (int i = 0; i < arr.length - 1; i++) {
        	if (arr[i] != arr[i + 1]) {
				intArr.add(arr[i + 1]);
			}
		}
        
        return intArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
