import java.util.HashMap;
import java.util.Map;

class Solution {
    public Map<String, Integer> createScoreMap(String[] name, int[] yearning) {
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
			scoreMap.put(name[i], yearning[i]);
		}
        return scoreMap;
    }

    public int calculateScore(Map<String, Integer> scoreMap, String[] photo) {
        int score = 0;
        for (String name : photo) {
            if (scoreMap.containsKey(name)) {
                score += scoreMap.get(name);
            }
        }
        return score;
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scoreMap = createScoreMap(name, yearning);

        for (int i = 0; i < photo.length; i++) {
			answer[i] = calculateScore(scoreMap, photo[i]);
		}
        
        return answer;
    }
}
