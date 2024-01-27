//pricture[i]를 k배 늘리는 작업
//그 pricture[i]를 k번 넣는 작업
//배열의 크기는 picture.length의 k배

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        String[] kTimesArr = new String[picture.length];
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                for (int p = 0; p < k; p++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            kTimesArr[i] = sb.toString();
        }
        
        int index = 0;
        for (int i = 0; i < kTimesArr.length; i++) {
            for (int j = 0; j < k; j++) {
                answer[index++] = kTimesArr[i];
            }
        }
        
        return answer;
    }
}

