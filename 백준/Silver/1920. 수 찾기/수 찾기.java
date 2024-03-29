import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int aLen = Integer.parseInt(reader.readLine());

		Set<String> aSet = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toSet());
		
		int mLen = Integer.parseInt(reader.readLine());
		
		String[] mArr = reader.readLine().split(" ");
		
		for (int i = 0; i < mLen; i++) {
			writer.write((aSet.contains(mArr[i])) ? "1" : "0");
			writer.newLine();
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
}
