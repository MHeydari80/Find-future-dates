package futuredate;

import java.util.Scanner;

public class FutureDate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Weekdays--->\tSunday[0]\tMonday[1]\tTuesday[2]\t"
                + "Wednesday[3]\tThursday[4]\tFriday[5]\t Saterday[6]\n");
        
        System.out.print("Enter today's day: \t");
        int today = input.nextInt();

        System.out.print("Enter the number of days eleapsed since today:\t");

        int future = input.nextInt();
        

        System.out.printf("\nToday is %s and the future day is %s\n\n\n",displayFutureDay(today),displayFutureDay(++future%7));

    }

    public static String displayFutureDay(int day) {

        String weekDay = null;
        switch (day) {

            case 0:
                weekDay = "Saturday";
                break;
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saterday";
                break;

        }

        return weekDay;

    }
}
