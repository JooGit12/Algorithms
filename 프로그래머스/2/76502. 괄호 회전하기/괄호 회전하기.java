import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
                
        for (int i = 0; i < s.length(); i++) {
            String rotatedString = s.substring(i) + s.substring(0, i);
            if (isCorrectStack(rotatedString)) answer++;
        }

        return answer;
    }
    
    private static boolean isCorrectStack(String s) {        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() 
                    && ((stack.peek() == '(' && c == ')') 
                    || (stack.peek() == '[' && c == ']') 
                    || (stack.peek() == '{' && c == '}'))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}
