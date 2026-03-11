/*
Check Out at the 10$ Store (CheckOut.java)
At the 10$ store nothing is more than $10.00.
Prompt the user for the price of their item (.50 cents to $10.00 dollars)
using the getRangedDouble method and
continue to input items as long as they indicate that they have more
using your getYNConfirm method.
Display the total cost of the item(s) to 2 decimal places with printf.

 */


import java.util.Scanner;


public class CheckOut {
    public static void main(String[] args) {
        boolean done = false;
        double price = 0.0;
        double total = 0.0;


        Scanner in = new Scanner(System.in);
        do{
            price = safeinput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            total += price;
            System.out.println("The price is $" + price);
            System.out.println("The total price is now $" + total);
            done = !safeinput.getYNConfirm(in, "Do you have more items to check out?");

        }while(!done);
        System.out.printf("Your total is: $%.2f%n", total);

    }

}
