class Solution {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int term;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				term = a + i * d;
				answer += term;
			}
		}
		return answer;
	}
}
