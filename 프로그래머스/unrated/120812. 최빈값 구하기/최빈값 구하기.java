import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
    	HashMap<Integer, Integer> modeMap = new HashMap<>();
    	
    	// 각 정수의 빈도수 계산
    	for (int i : array) {
			if (modeMap.containsKey(i)) {
				modeMap.put(i, modeMap.get(i) + 1);
			}else {
				modeMap.put(i, 1);
			}
		}
    	
    	// 최빈값 찾기
    	int mode = array[0];
    	int maxCount = 0;
    	boolean multipleModes = false;
    	for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mode = entry.getKey();
				multipleModes = false;
			} else if (entry.getValue() == maxCount) {
				multipleModes = true;
			}
		}
    	
    	return multipleModes ? - 1 : mode;
    }
}
