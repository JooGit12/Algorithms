import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
    	String[] arr = Arrays.stream(myString.split("x|(?=[^a-z])")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    	return arr;
    }
}