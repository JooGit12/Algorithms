import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)));

        if (direction.equals("right")) {
            list.addFirst(list.removeLast());
        } else {
            list.addLast(list.removeFirst());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
