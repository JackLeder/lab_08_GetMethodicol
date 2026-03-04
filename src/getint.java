import java.util.Scanner;

import java.util.Scanner;

public class getint {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = getInt(s, "Enter an integer");
        System.out.println("You entered: " + val);
        s.close();
    }

    public static int getInt(Scanner pipe, String prompt){
        boolean done = false;
        int val = 0;

        do{
            System.out.print(prompt+ ": ");
            if (pipe.hasNextInt()) {
                val = pipe.nextInt();
                pipe.nextLine(); // consume the rest of the line
                done = true;
            }else{
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }while (!done);
        return val;
    }
}


