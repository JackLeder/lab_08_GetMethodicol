import java.util.Scanner;
public class safeinput {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);


        //int age = getRangedInt(pipe, "Enter your age", 0, 120);
        //System.out.println("Your age is: " + age);
    }






    /**
     * This method prompts the user for input and continues to prompt until a non-zero length string is entered.
     * @param pipe
     * @param prompt
     * @return
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();

        }while(retString.length() == 0);

        return retString;

    }

    /**
     * This method prompts the user for input and continues to prompt until a valid integer is entered.
     * @param pipe scanner to read inetger
     * @param prompt to show the user
     * @return a valid integer entered by the user
     */
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


    /**
     * This method prompts the user for input and continues to prompt until a valid double is entered.
     * @param pipe scanner to read double
     * @param prompt to show the user
     * @return a valid double entered by the user
     */

    public static double getDouble(Scanner pipe, String prompt){
        boolean done = false;
        double val = 0;

        do{
            System.out.print(prompt+ ": ");
            if (pipe.hasNextDouble()) {
                val = pipe.nextDouble();
                pipe.nextLine(); // consume the rest of the line
                done = true;
            }else{
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }while (!done);
        return val;
    }

    /**
     * This method prompts the user for input and continues to prompt until a valid integer within the specified range is entered.
     * @param pipe scanner to read integer
     * @param prompt to show the user
     * @param low minimum acceptable value
     * @param high maximum acceptable value
     * @return a valid integer within the specified range entered by the user
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        int val = 0;

        do{
            System.out.print(prompt+ ": ");
            if (pipe.hasNextInt()) {
                val = pipe.nextInt();
                pipe.nextLine();

                if (val >= low && val <= high) {
                    done = true;
                }else{
                    System.out.println("Integer must be between " + low + " and " + high);
                }


                done = true;
            }else{
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }while (!done);
        return val;

    }

}
