class Solution {
	public int solution(String myString, String pat) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < myString.length(); i++) {
			sb.append(Character.toString(myString.charAt(i)).equals("A") ? "B" : "A");
		}

		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			if (sb.substring(i, pat.length() + i).equals(pat)) return 1;
		}

		return 0;
	}
}
