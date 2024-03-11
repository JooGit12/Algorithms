import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] inputs = new String[Integer.parseInt(br.readLine())];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = br.readLine();
            }

            Arrays.sort(inputs, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

            Set<String> uniqueStrings = new LinkedHashSet<>(Arrays.asList(inputs));

            for (String uniqueString : uniqueStrings) {
                bw.write(uniqueString);
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
