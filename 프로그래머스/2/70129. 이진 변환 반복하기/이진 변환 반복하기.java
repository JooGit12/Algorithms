class Solution {
	public int[] solution(String s) {

		int countZero = 0;
		int countNum = 0;

		while (!s.equals("1")) {
			int countOne = 0;
			countNum++;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					countZero++;
				}else {
					countOne++;
				}
			}
			s = Integer.toBinaryString(countOne);
		}

		int[] answer = { countNum, countZero };

		return answer;
	}
}
