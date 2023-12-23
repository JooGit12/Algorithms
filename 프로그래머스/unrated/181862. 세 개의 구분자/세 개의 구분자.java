import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
    	ArrayList<String> strArr = new ArrayList<>();
    	
    	String[] arr = myStr.split("[abc]");
    	
    	for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) strArr.add(arr[i]);
		}
    	
    	if (strArr.isEmpty()) {
			return new String[] {"EMPTY"};
		}else {
			return strArr.stream().toArray(String[]::new);			
		}
    	
    }
}
