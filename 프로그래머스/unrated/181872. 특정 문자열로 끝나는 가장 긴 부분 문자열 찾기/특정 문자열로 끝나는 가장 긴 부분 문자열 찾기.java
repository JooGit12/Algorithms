class Solution {
    public String solution(String myString, String pat) {
    	int patPlace = 0;
    	
    	for (int i = myString.length() - pat.length(); i >= 0; i--) {
			if (myString.substring(i, i + pat.length()).equals(pat)) {
				patPlace = i;
				break;
			}
		}
    	
    	return myString.substring(0, patPlace + pat.length());
    }
}
