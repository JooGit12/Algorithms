public class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
