class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
			char a = my_string.charAt(i);
			sb.append(Character.isUpperCase(a) ? Character.toLowerCase(a) : Character.toUpperCase(a));  
		}
        
        return sb.toString();
    }
}
