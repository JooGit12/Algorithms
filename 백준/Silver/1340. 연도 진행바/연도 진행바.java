import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String [] times = input[3].split(":");
        
        int year = Integer.parseInt(input[2]);
        int month = Month.valueOf(input[0].toUpperCase()).getValue();
        int day = Integer.parseInt(input[1].substring(0, 2));
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        System.out.println(getYearPercent(year, month, day, hour, minute));
        reader.close();
    }

    private static double getYearPercent(int year, int month, int day, int hour, int minute) {
        int totalDays = Year.of(year).length();
        int dateOfYear = LocalDate.of(year, month, day).getDayOfYear();
        double timeOfDay = (hour + minute / 60.0) / 24.0;
        double yearPercent = ((dateOfYear - 1) + timeOfDay) / totalDays * 100;
        
        return yearPercent;
    }
}
