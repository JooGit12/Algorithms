import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
    	List<Integer> intArr = new ArrayList<>();
    	int a = 10;
    	
    	for (int i = 0; i < arr.length; i++) {
			if (a != arr[i]) {
				intArr.add(arr[i]);
				a = arr[i]; 
			}
		}
    	
    	int[] answer = new int[intArr.size()];
    	
    	for (int i = 0; i < answer.length; i++) {
			answer[i] = intArr.get(i);
		}
    	
    	return answer;
    }
}
