class Solution {
	public int[] solution(String s) {
		int countZero = 0;
		int countNum = 0;

		while (!s.equals("1")) {
			countNum++;
			int[] result = countZeroAndOne(s);
			countZero += result[0];
			s = Integer.toBinaryString(result[1]);
		}

		return new int[] { countNum, countZero };
	}

	private int[] countZeroAndOne(String s) {
		int countZero = 0;
		int countOne = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				countZero++;
			} else {
				countOne++;
			}
		}

		return new int[] { countZero, countOne };
	}
}
