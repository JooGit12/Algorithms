import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (String str : intStrs) {
			int a = Integer.parseInt(str.substring(s, s + l));
			if (a > k) {
				intArr.add(a);
			}
		}
        
        return intArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
