import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int[] solution(String s) {        
        String[] tuples = s.substring(2, s.length() - 2).split("\\},\\{");
        
        Arrays.sort(tuples, Comparator.comparingInt(String::length));
        
        Set<Integer> addedTuple = new LinkedHashSet<>();
        
        for (String tuple : tuples) {
            String[] numbers = tuple.split(",");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                addedTuple.add(num);
            }         
        }
        
        return addedTuple.stream().mapToInt(Integer::intValue).toArray();
    }
}
