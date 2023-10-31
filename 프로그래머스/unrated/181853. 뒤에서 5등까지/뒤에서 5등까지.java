import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list) {
		return Arrays.copyOf(Arrays.stream(num_list).sorted().toArray(), 5);
	}
}
