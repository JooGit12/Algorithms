class Solution {
    public int solution(int[] num_list) {
    	StringBuilder sb = new StringBuilder();
    	String a = "";
    	String b = "";
    	for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				a += Integer.toString(num_list[i]);
			} else {
				b += Integer.toString(num_list[i]);
			}
		}
    	return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
