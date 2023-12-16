class Solution {
    public int solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
			sb.append(Character.isAlphabetic(my_string.charAt(i)) ? ',' : my_string.charAt(i));
		}
        
        String[] numArr = sb.toString().split(",");
        
        for (int i = 0; i < numArr.length; i++) {
			if (!numArr[i].isEmpty()) {
				answer += Integer.parseInt(numArr[i]);
			}
		}
        
        return answer;
    }
}
