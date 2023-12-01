import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
    	
    	StringBuilder sb = new StringBuilder();
        String[] morseArr = letter.split(" ");
        
        Map<String, Character> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", 'a');
        morseCodeMap.put("-...", 'b');
        morseCodeMap.put("-.-.", 'c');
        morseCodeMap.put("-..", 'd');
        morseCodeMap.put(".", 'e');
        morseCodeMap.put("..-.", 'f');
        morseCodeMap.put("--.", 'g');
        morseCodeMap.put("....", 'h');
        morseCodeMap.put("..", 'i');
        morseCodeMap.put(".---", 'j');
        morseCodeMap.put("-.-", 'k');
        morseCodeMap.put(".-..", 'l');
        morseCodeMap.put("--", 'm');
        morseCodeMap.put("-.", 'n');
        morseCodeMap.put("---", 'o');
        morseCodeMap.put(".--.", 'p');
        morseCodeMap.put("--.-", 'q');
        morseCodeMap.put(".-.", 'r');
        morseCodeMap.put("...", 's');
        morseCodeMap.put("-", 't');
        morseCodeMap.put("..-", 'u');
        morseCodeMap.put("...-", 'v');
        morseCodeMap.put(".--", 'w');
        morseCodeMap.put("-..-", 'x');
        morseCodeMap.put("-.--", 'y');
        morseCodeMap.put("--..", 'z');
        
        for (int i = 0; i < morseArr.length; i++) {
			if(morseCodeMap.containsKey(morseArr[i])) {
				sb.append(morseCodeMap.get(morseArr[i]));
			}
		}
        
        return sb.toString();
    }
}
