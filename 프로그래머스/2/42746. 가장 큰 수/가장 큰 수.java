import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public String solution(int[] numbers) {
		String[] stringNums = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			stringNums[i] = Integer.toString(numbers[i]);
		}
		
        Arrays.sort(stringNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
		
        if (stringNums[0].equals("0")) return "0";
        
        StringBuilder builder = new StringBuilder();
		for (int i = 0; i < stringNums.length; i++) {
			builder.append(stringNums[i]);
		}
		
		return builder.toString();
	}
}
