import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
