import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int countZeroes = 0;
		int countMatches = 0;

		Set<Integer> win_nums_set = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());

		for (Integer myNum : lottos) {
			if (myNum == 0) {
				countZeroes++;
				continue;
			}
			if (!win_nums_set.add(myNum)) countMatches++;
		}

		answer[0] = Math.min(7 - countMatches - countZeroes, 6);
		answer[1] = Math.min(7 - countMatches, 6);
		
		return answer;
	}
}
