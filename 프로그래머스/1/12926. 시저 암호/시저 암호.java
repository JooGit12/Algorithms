class Solution {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isLowerCase(c)) {
				c = (char) ((c - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(c)) {
				c = (char) ((c - 'A' + n) % 26 + 'A');
			}
			sb.append(c);
		}
		
		return sb.toString();
	}
}
