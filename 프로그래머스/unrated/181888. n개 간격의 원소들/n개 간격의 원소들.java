import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
			arr.add(num_list[i]);
		}
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
