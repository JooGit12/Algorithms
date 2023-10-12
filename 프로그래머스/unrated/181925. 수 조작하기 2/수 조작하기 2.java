class Solution {
    public String solution(int[] numLog) {
        String control = "";
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1)
                control += 'w';
            else if(numLog[i] - numLog[i - 1] == -1)
                control += 's';
            else if (numLog[i] - numLog[i - 1] == 10)
                control += 'd';
            else
                control += 'a';
        }
        return control;
    }
}