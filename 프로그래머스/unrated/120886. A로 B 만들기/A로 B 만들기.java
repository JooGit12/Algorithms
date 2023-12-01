import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        return Arrays.equals(beforeChars, afterChars) ? 1 : 0;
    }
}
