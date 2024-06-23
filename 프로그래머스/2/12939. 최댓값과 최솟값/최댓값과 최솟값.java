import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] stringArray = s.split(" ");
        int[] intArray = new int[stringArray.length];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        Arrays.sort(intArray);
        
        return intArray[0] + " " + intArray[intArray.length - 1];
    }
}
