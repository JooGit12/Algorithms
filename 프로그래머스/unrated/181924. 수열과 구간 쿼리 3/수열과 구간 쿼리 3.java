import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    	
    	ArrayList<Integer> intList = new ArrayList<>(arr.length);
    	
    	for (int i = 0; i < arr.length; i++) {
			intList.add(arr[i]);
		}
    	
    	for (int i = 0; i < queries.length; i++) {
			Collections.swap(intList, queries[i][0], queries[i][1]);
		}
    	
    	return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}
