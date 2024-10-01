import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int classesNum = Integer.parseInt(reader.readLine());
        String[] studentsNumStr = reader.readLine().split(" ");
        String[] abilities = reader.readLine().split(" ");
        
        int masterAbility = Integer.parseInt(abilities[0]);
        int viewerAbility = Integer.parseInt(abilities[1]);
        long totalViewers = 0;

        for (int i = 0; i < classesNum; i++) {
            int students = Integer.parseInt(studentsNumStr[i]);
            totalViewers++;           
            if (students > masterAbility) {
                totalViewers += (students - masterAbility + viewerAbility - 1) / viewerAbility;
            }
        }

        System.out.print(totalViewers);
        reader.close();
    }
}
