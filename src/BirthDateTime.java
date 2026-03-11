
/*
Date and Time of Birth (BirthDateTime.java)
Use the getRangedInt method to input the year (1950-2015), month (1-12), Day*, hours (1 – 24),
Minutes (1-59) of a person's birth.
Note: Use a switch() conditional selector structure to limit the user
to the correct number of days for the month they were born in. For instance,
if they were born in Feb [1-29], Oct [1-31].
HINT: There are only 3 groups here, not 12 different ones!

 */
import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        year = safeinput.getRangedInt(in, "Enter your birth year", 1950, 2026);
        month = safeinput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch (month){
            case 2:
                day = safeinput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11:
                day = safeinput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            default:
                day = safeinput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
        }
        hours = safeinput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minutes = safeinput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("\nYour birth date and time is: " + month + "/" + day + "/" + year + " " + hours + ":" + minutes);


    }




}
