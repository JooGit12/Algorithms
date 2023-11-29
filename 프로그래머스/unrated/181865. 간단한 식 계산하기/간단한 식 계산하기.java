class Solution {
    public int solution(String binomial) {
    	String[] splitBio = binomial.split(" ");
    	int a = Integer.valueOf(splitBio[0]);
    	int b = Integer.valueOf(splitBio[2]);
    	
    	if (splitBio[1].equals("+")) return a + b;
		else if (splitBio[1].equals("-"))return a - b;
		else return a * b;

    }    	
}
