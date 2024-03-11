import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(getGrade(br.readLine()));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getGrade(String s) {
		Map<String, Float> gradeMap = new HashMap<>();
		
		gradeMap.put("A+", 4.3f);
		gradeMap.put("A0", 4.0f);
		gradeMap.put("A-", 3.7f);
		gradeMap.put("B+", 3.3f);
		gradeMap.put("B0", 3.0f);
		gradeMap.put("B-", 2.7f);
		gradeMap.put("C+", 2.3f);
		gradeMap.put("C0", 2.0f);
		gradeMap.put("C-", 1.7f);
		gradeMap.put("D+", 1.3f);
		gradeMap.put("D0", 1.0f);
		gradeMap.put("D-", 0.7f);
		gradeMap.put("F", 0.0f);
		
		return gradeMap.get(s).toString();
	}
}
