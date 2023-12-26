class Solution {
    public String solution(String polynomial) {
        int num = 0;
        int countX = 0;
        
        String[] polynomialArray = polynomial.split("\\s+\\+\\s+");
        
        for (String term : polynomialArray) {
            if (term.contains("x")) {
                countX += processX(term);
            } else {
                num += Integer.parseInt(term);
            }
        }

        return formatAnswer(countX, num);
    }

    private int processX(String term) {
        if (term.length() == 1) {
            return 1;
        } else {
            return Integer.parseInt(term.replaceAll("x", ""));
        }
    }

    private String formatAnswer(int countX, int num) {
        if (countX == 0) {
            return Integer.toString(num);
        } else if (countX == 1) {
            return "x" + (num == 0 ? "" : " + " + num);
		} else {
            return countX + "x" + (num == 0 ? "" : " + " + num);
        }
    }
}
