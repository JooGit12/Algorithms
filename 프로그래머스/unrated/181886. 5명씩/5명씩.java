import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> champions = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
			champions.add(names[i]);
		}
        
        return champions.toArray(new String[0]);
    }
}
