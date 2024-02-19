import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = readWords(br);
        int prefixXSetSize = calculatePrefixXSetSize(words);
        System.out.println(prefixXSetSize);
    }

    private static String[] readWords(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        return words;
    }

    private static int calculatePrefixXSetSize(String[] words) {
        Arrays.sort(words);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i])) {
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}
