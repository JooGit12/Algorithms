import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				list.add(arr[i]);
			}
		}
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
