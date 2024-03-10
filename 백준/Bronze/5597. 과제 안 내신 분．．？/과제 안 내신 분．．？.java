import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
        	int[] niceStudents = new int[30];
        	
        	for (int i = 0; i < 28; i++) {
        		int num = Integer.parseInt(br.readLine());
				niceStudents[num - 1] = num;
			}
        	
        	for (int i = 0; i < 30; i++) {
				if (niceStudents[i] == 0) {
					bw.write(String.valueOf(i + 1));
					bw.newLine();
				}
			}
        	
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
