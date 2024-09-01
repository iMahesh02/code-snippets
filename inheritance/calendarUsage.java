package inheritance;


import java.io.*;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DAY_OF_MONTH, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String dayName = "";

        switch(dayOfWeek) {
            case Calendar.SUNDAY:
                dayName = "SUNDAY";
                break;
            case Calendar.MONDAY:
                dayName = "MONDAY";
                break;
            case Calendar.TUESDAY:
                dayName = "TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                dayName = "WEDNESDAY";
                break;
            case Calendar.THURSDAY:
                dayName = "THURSDAY";
                break;
            case Calendar.FRIDAY:
                dayName = "FRIDAY";
                break;
            case Calendar.SATURDAY:
                dayName = "SATURDAY";
                break;
        }
        return dayName;
    }

}

public class calendarUsage {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

