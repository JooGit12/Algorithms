import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
    	Arrays.sort(array);
        return array.length % 2 == 0 ? array[array.length / 2 - 1] : array[array.length / 2];
    }
}
