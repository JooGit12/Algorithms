class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int mother = num1 * num2;
        int son1 = num1 * denum2;
        int son2 = num2 * denum1;
        int totalSon = son1 + son2;
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        int[] answer = {totalSon, mother};
        return answer;
    }
}
