import java.util.Arrays;

class Solution {
	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		String str = "";

		String[] newDic = new String[dic.length];

		for (int i = 0; i < dic.length; i++) {
			char[] charDic = dic[i].toCharArray();
			Arrays.sort(charDic);
			newDic[i] = new String(charDic);
		}

		Arrays.sort(spell);

		for (int i = 0; i < spell.length; i++) {
			str += spell[i];
		}

		for (int i = 0; i < newDic.length; i++) {
			if (newDic[i].equals(str)) {
				answer = 1;
				break;
			}
		}

		return answer;
	}
}
