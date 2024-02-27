import java.util.ArrayList;

class Solution {
	public int[] solution(int[] answers) {

		int[] giveUpMath1 = { 1, 2, 3, 4, 5 };
		int[] giveUpMath2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] giveUpMath3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int scores[] = { 0, 0, 0 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == giveUpMath1[i % giveUpMath1.length]) {
				scores[0]++;
			}
			if (answers[i] == giveUpMath2[i % giveUpMath2.length]) {
				scores[1]++;
			}
			if (answers[i] == giveUpMath3[i % giveUpMath3.length]) {
				scores[2]++;
			}
		}

		int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

		ArrayList<Integer> maxScoreList = new ArrayList<>();

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == maxScore) {
				maxScoreList.add(i + 1);
			}
		}

		int[] answer = new int[maxScoreList.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = maxScoreList.get(i);
		}
		
		return answer;
	}

}
