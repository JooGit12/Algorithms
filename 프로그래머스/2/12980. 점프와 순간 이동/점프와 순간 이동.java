public class Solution {
	public int solution(int n) {
		String binaryN = Integer.toBinaryString(n);
		int answer = 0;
		
		for (char ch : binaryN.toCharArray()) {
			if (ch == '1') answer++;
		}
		
		return answer;
	}
}
