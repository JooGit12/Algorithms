import java.util.ArrayList;
import java.util.HashSet;

class Solution {
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> arr_v2 = new ArrayList<>();
		HashSet<Integer> deletSet = new HashSet<>();

		for (Integer integer : delete_list) {
			deletSet.add(integer);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!deletSet.contains(arr[i])) {
				arr_v2.add(arr[i]);
			}
		}

		return arr_v2.stream().mapToInt(x -> x).toArray();
	}
}
