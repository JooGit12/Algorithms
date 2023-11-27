class Solution {
	public String solution(String my_string, String alp) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < my_string.length(); i++) {
			char currentChar = my_string.charAt(i);
			String currentCharToString = String.valueOf(currentChar);
			sb.append(alp.equals(currentCharToString) ? currentCharToString.toUpperCase() : currentChar);
		}

		return sb.toString();
	}
}
