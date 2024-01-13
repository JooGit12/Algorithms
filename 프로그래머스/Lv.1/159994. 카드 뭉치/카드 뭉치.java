import java.util.Stack;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> cardsStack1 = new Stack<>();
        Stack<String> cardsStack2 = new Stack<>();
        
        for (int i = cards1.length - 1; i >= 0; i--) {
			cardsStack1.push(cards1[i]);
		}
        
        for (int i = cards2.length - 1; i >= 0; i--) {
			cardsStack2.push(cards2[i]);
		}
        
        for (int i = 0; i < goal.length; i++) {
			if (!cardsStack1.isEmpty() && cardsStack1.peek().equals(goal[i])) {
				cardsStack1.pop();
			} else if (!cardsStack2.isEmpty() && cardsStack2.peek().equals(goal[i])) {
				cardsStack2.pop();
			}else {
				return "No";
			}
		}
        
		return "Yes";
	}
}
