import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stackInt = new Stack<>();
        
        for (int i = 0; i < flag.length; i++) {
        	if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					stackInt.push(arr[i]);
				}
			}else {
				for (int j = 0; j < arr[i]; j++) {
					stackInt.pop();
				}
			}
		}
                
        return stackInt.stream().mapToInt(Integer::intValue).toArray();
    }
}
