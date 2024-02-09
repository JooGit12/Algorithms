class Solution {
	public int[] solution(int n, int m) {
		int[] answer = {findGCD(n, m), findLCM(n, m)};
		return answer;
	}

	private static int findLCM(int n, int m) {
		return (n * m) / findGCD(n, m);
	}

	private static int findGCD(int n, int m) {
		while (m != 0) {
			int temp = m;
			m = n % m;
			n = temp;
		}
		return n;
	}
	
}
