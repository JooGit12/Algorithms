import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i < slicer[1] + 1; i++) {
                arr.add(num_list[i]);
            }
        }

        if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                arr.add(num_list[i]);
            }
        }

        if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                arr.add(num_list[i]);
            }
        }

        if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1] && i < num_list.length; i += slicer[2]) {
                arr.add(num_list[i]);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
