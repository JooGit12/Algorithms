class Solution {
	public long solution(long n) {

		double sqrtN = Math.sqrt(n);

		if (sqrtN % 1 != 0.0) {
			return -1;
		}

		return (long) Math.pow(sqrtN + 1, 2);
	}
}

