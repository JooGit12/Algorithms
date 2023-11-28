import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> done = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) done.add(todo_list[i]);
		}
        
        return done.toArray(new String[0]);
    }
}
