import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : chars){
            charMap.put(c, charMap.getOrDefault(c, 0) +1);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : charMap.keySet()){
            if( charMap.get(c) == 1){
                sb.append(c);
            }
        }
        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
