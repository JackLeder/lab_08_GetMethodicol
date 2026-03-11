/*
This is a one-off method so place it in the same file as
your program code after main at the bottom of the file within the class.
Note that you place it outside of and after main within the class body.
Now code a program that creates a
tabular display of two columns with the Celsius value on the left and the equivalent
Fahrenheit value on the right. The table should show degrees centigrade in
1-degree increments from -100 to 100. Create the table by using a
for loop to drive a printf statement with the two temperatures.

 */
import java.util.Scanner;

public class Cftable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Celsius\tFahrenheit");
        for (int i = -100; i <= 100; i += 1) {
            System.out.printf("%d\t%.1f\n", i, CtoF(i));
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;

    }
}

