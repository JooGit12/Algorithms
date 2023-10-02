class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }

        if (str1.length() > str2.length()) {
            answer.append(str1.substring(minLength));
        } else if (str2.length() > str1.length()) {
            answer.append(str2.substring(minLength));
        }
        
        return answer.toString();
    }
}
