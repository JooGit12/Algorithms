import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] arr) {
        int answer = - 1;
        
        HashSet<String> set = new HashSet<>();
        
        while (set.add(Arrays.toString(arr))) {
            arr = modifyArr(arr);
            answer++;
        }
        
        return answer;
    }
    
    private int[] modifyArr(int[] arr) {
    	ArrayList<Integer> modifiedArr = new ArrayList<>();
    	
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				modifiedArr.add(arr[i] / 2);
			} else if (arr[i] < 50 && arr[i] % 2 == 1) {
				modifiedArr.add(arr[i] * 2 + 1);
			}else {
				modifiedArr.add(arr[i]);
			}
		}
    	
    	return modifiedArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
