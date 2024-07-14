import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int lightIndex = 0;
        int heavyIndex = people.length - 1;
        
        while(lightIndex <= heavyIndex) {
            if(people[lightIndex] + people[heavyIndex] <= limit) {
                heavyIndex--;
                lightIndex++;
                answer++;
            } else {
                heavyIndex--;
                answer++;
            }
        }
        
        return answer;
    }
}