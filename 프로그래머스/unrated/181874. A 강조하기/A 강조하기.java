class Solution {
	public String solution(String myString) {
		myString = myString.toLowerCase();
		StringBuilder sb = new StringBuilder(myString);
		
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'a') sb.setCharAt(i, 'A');
		}
		
		return sb.toString();
	}
}
