import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double favdouble = 0.0;
        int favNum = 0;
        favNum = safeinput.getInt(in, "Enter your favorite number");
        System.out.println("\nYour favorite number is: " + favNum);
        favdouble = safeinput.getDouble(in, "Enter your favorite double");
        System.out.println("\nYour favorite double is: " + favdouble);
    }
}
