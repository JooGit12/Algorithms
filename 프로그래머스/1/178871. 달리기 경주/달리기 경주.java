import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> positions = new HashMap<>();
        
        int currentPosition = 0;
        String chaser = "";
        
        for (int i = 0; i < players.length; i++) {
			positions.put(players[i], i);
		}
        
        for (String calling : callings) {
			currentPosition = positions.get(calling);
			
			chaser = players[currentPosition - 1];
			players[currentPosition - 1] = players[currentPosition];
			players[currentPosition] = chaser;
			
			positions.put(players[currentPosition], currentPosition);
			positions.put(players[currentPosition - 1], currentPosition - 1);
		}
        
        return players;
    }
}
