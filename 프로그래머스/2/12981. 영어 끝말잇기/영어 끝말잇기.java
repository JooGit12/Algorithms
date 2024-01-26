import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isValidWords(words[i - 1], words[i], wordSet)) {
                answer[0] = (i % n) + 1;
                answer[1] = i / n + 1;
                break;
            }
            wordSet.add(words[i]);
        }
        
        return answer;
    }

    private boolean isValidWords(String prevWord, String currentWord, Set<String> wordSet) {
        int endChar = prevWord.length() - 1;
        return !wordSet.contains(currentWord) && prevWord.charAt(endChar) == currentWord.charAt(0) && currentWord.length() > 1;
    }
}
