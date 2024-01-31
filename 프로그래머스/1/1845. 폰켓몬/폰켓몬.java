import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> setMon = new HashSet<>();
        
        for (int num : nums) {
			setMon.add(num);
		}
        
        int maxMon = nums.length / 2;
        int setMonSize = setMon.size();
        
        return setMonSize < maxMon ? setMonSize : maxMon;
    }
}
