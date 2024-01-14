import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(i)) intList.add(i);
        }
        
        return intList.isEmpty() ? new int[]{-1} : intList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isZeroOrFive(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
