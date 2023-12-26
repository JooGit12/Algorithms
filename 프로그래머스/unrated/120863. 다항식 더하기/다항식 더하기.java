class Solution {
    public String solution(String polynomial) {
        String answer = "";        
        int num = 0;
        int countX = 0;
        
        String[] polynomialArray = polynomial.split("\\s+\\+\\s+");
        
        for (int i = 0; i < polynomialArray.length; i++) {
			if (!polynomialArray[i].contains("x")) {
				num += Integer.parseInt(polynomialArray[i]);
			}else if (polynomialArray[i].contains("x") && polynomialArray[i].length() == 1) {
				countX++;
			}else {
				countX += Integer.parseInt(polynomialArray[i].replaceAll("x", ""));
			}
		}
        
        
        if (countX == 0) {
			return num + "";
		}else if (num == 0) {
			return countX + "x";
		}else {
			return countX + "x + " + num;
		}
        
    }
}
