import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// AAA -> 999
// 각 자릿수중에 가장 높은 값 뿐만 아니라 2순위로 얼마나 빈번히 나오는 수인지까지 구해야함.
// 두 수의 가치가 같지만 다른 알파벳이라면 어떤 수가 오든 상관이 없음.
// ex) AAA == 100*A + 10*A + A
// 전체 문자열 중에 가장 가치가 높은 알파벳을 찾아가며 값을 넣는다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> digitMap = new HashMap<>();
        int answer = 0;
        
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String input = reader.readLine();
            int inputLen = input.length();
            for (int j = 0; j < inputLen; j++) {
                char currentChar = input.charAt(j);
                int digit = digitMap.getOrDefault(currentChar, 0);
                digitMap.put(currentChar, digit + getDigit(j, inputLen));
            }
        }
        
        List<Map.Entry<Character, Integer>> digitList = new ArrayList<>(digitMap.entrySet());
        digitList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int count = 9;
        
        for (Map.Entry<Character, Integer> entry : digitList) {
            answer += entry.getValue() * count--;
        }
        
        System.out.println(answer);
        reader.close();
    }
    
    private static int getDigit(int j, int inputLen) {
        return (int)(Math.pow(10, inputLen - j - 1));
    }
}
