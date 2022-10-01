package Loops;

import java.util.Scanner;

/*While Loop:
-each store employee moke $15 and hour. Write a program that allows
the employee to enter the number of hours workedfor the week. Do not
allow overtime
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        //initialize know variables
        int rate=15;
        int maxHorus=40;

        //Get input from unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner=new Scanner(System.in);
        double hoursWorked= scanner.nextDouble();

        //validate input
        while(hoursWorked>maxHorus || hoursWorked<1){
            System.out.println("Invalid entry. Your hours much be between 1 and 40. Please try again.");
            hoursWorked=scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross
        double gross=rate*hoursWorked;
        System.out.println("Gross pay: $"+gross);

    }
}
