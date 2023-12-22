import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
    	
        for (int i = 0; i < arr.length; i++) {
			if (!stk.isEmpty() && stk.peek() == arr[i]) {
				stk.pop();
			}else {
				stk.push(arr[i]);
			}
		}
        
        if (stk.isEmpty()) {
			stk.push(- 1);
		}
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
