import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int N, int[] stages) {                
        Map<Integer, Integer> stagesMap = new HashMap<>();
        Map<Integer, Double> failureMap = new HashMap<>();
        
        for (int stage : stages) {
            stagesMap.put(stage, stagesMap.getOrDefault(stage, 0) + 1);
        }
        
        int remnant = stages.length;
        for (int i = 1; i <= N; i++) {
            int reached = stagesMap.getOrDefault(i, 0);
            double fail = (remnant > 0) ? (double) reached / remnant : 0;
            failureMap.put(i, fail);
            remnant -= reached;
        }
        
        return IntStream.rangeClosed(1, N)
                .boxed()
                .sorted((s1, s2) -> {
                    int compare = failureMap.get(s2).compareTo(failureMap.get(s1));
                    if (compare == 0) {
                        return s1.compareTo(s2);
                    }
                    return compare;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

