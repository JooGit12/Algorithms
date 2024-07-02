import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set<Integer> sums = new HashSet<>();
        
        for (int i = 0; i < len; i++) {
            int sum = elements[i];
            sums.add(sum);
            for (int j = i + 1; j < i + len; j++) {
                sum += elements[j % len];
                sums.add(sum);
            }
        }

        return sums.size();
    }
}
