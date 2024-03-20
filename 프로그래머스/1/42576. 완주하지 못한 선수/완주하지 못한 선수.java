import java.util.HashMap;

class Solution {
	public String solution(String[] participant, String[] completion) {		
		HashMap<String, Integer> participantMap = new HashMap<>();
		
		for (String player : participant) {
			participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
		}
		
		for (String completedPlayer : completion) {
			participantMap.put(completedPlayer, participantMap.get(completedPlayer) - 1);
		}
		
		for (String key : participantMap.keySet()) {
			if (participantMap.get(key) != 0) {
				return key;
			}
		}
		
		return null;
	}
}
