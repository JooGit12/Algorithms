import java.util.ArrayList;
import java.util.List;

class Solution {
    private int[] calculateEndDays(int[] progresses, int[] speeds) {
        int[] daysArr = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) % speeds[i] == 0 ?
                    (100 - progresses[i]) / speeds[i] :
                    (100 - progresses[i]) / speeds[i] + 1;
            daysArr[i] = days;
        }
        return daysArr;
    }

    private List<Integer> calculateDeployCount(int[] daysArr) {
        List<Integer> deployCountList = new ArrayList<>();
        int deployDay = daysArr[0];
        int deployCount = 1;
        for (int i = 1; i < daysArr.length; i++) {
            if (daysArr[i] <= deployDay) {
                deployCount++;
            } else {
                deployCountList.add(deployCount);
                deployDay = daysArr[i];
                deployCount = 1;
            }
        }
        deployCountList.add(deployCount);
        return deployCountList;
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] daysArr = calculateEndDays(progresses, speeds);
        List<Integer> deployCountList = calculateDeployCount(daysArr);
        return deployCountList.stream().mapToInt(Integer::intValue).toArray();
    }
}
