import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int lastIdx = num_list.length - 1;
        int lastElement = num_list[lastIdx];
        
        if (lastElement > num_list[lastIdx - 1]) {
            num_list = Arrays.copyOf(num_list, lastIdx + 2);
            num_list[lastIdx + 1] = lastElement - num_list[lastIdx - 1];
        } else {
            num_list = Arrays.copyOf(num_list, lastIdx + 2);
            num_list[lastIdx + 1] = 2 * lastElement;
        }
        
        return num_list;
    }
}
