import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> cardsStack1 = convertArrayToStack(cards1);
        Stack<String> cardsStack2 = convertArrayToStack(cards2);
        
        return isMatchGoal(cardsStack1, cardsStack2, goal) ? "Yes" : "No";
    }
    
    private Stack<String> convertArrayToStack(String[] array) {
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(array));
        Collections.reverse(stack);
        return stack;
    }

    private boolean isMatchGoal(Stack<String> stack1, Stack<String> stack2, String[] goal) {
        for (String target : goal) {
            if (!stack1.isEmpty() && stack1.peek().equals(target)) {
                stack1.pop();
            } else if (!stack2.isEmpty() && stack2.peek().equals(target)) {
                stack2.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
