
import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = safeinput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("valid SSN: " + SSN);
        String uc_id = safeinput.getRegExString(in, "Enter your UC ID", "^M\\d{5}$");
        System.out.println("valid UC ID: " + uc_id);
        String OpenChoice = safeinput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$" );
        System.out.println("valid menu choide: " + OpenChoice);
    }
}
