import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        Map<String, String> map = new HashMap<>();
        map.put("zero" , "0"); map.put("one"  , "1"); map.put("two"  , "2"); map.put("three", "3"); 
        map.put("four" , "4"); map.put("five" , "5"); map.put("six"  , "6"); map.put("seven", "7"); 
        map.put("eight", "8"); map.put("nine" , "9");

        for(String x : map.keySet()) 
            numbers = numbers.replace(x, map.get(x));

        return Long.parseLong(numbers);
    }
}