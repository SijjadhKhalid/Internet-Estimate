//Sijjad Khalid
//10-4-17
//Internet Server Program

import java.util.Scanner;
public class InternetServerSK {

    public static void main(String[] args) {
	// Begin main

        //Save Variables
        char letter;
        String letterSt;
        int hours;
        double total;


        Scanner Keyboard = new Scanner(System.in);

        //enter the letter of package
        System.out.println("This program will ask you to enter the letter of the package for your internet"
                            +" provider and the number of hours that were used.");
        System.out.println("\n Enter the letter of the package you have (A, B, or C)");
        letterSt = Keyboard.nextLine();
        
        //Convert String to Char
        letter = letterSt.charAt(0);


        //enter the amount of hours used
        System.out.println("Enter the amount of hours that were used in the month.");
        hours = Keyboard.nextInt();

        //Switch statements

        switch (letter){
            case 'A':
            case 'a':
                if (hours > 10){
                    total = ((hours - 10) * 2) + 9.95;
                    System.out.println("Your total charges are $" + total+ " for the month");
                     }
                else if (hours <= 10)  {
                    total = 9.95;
                    System.out.println("Your total charges are $" + total+ " for the month"); }

                break;

            case 'B':
            case 'b':
                if (hours > 20)
                    {total = ((hours - 20) * 1) + 13.95;
                    System.out.println("Your total charges are $"+total+ " for the month");}
                else if (hours <= 20)
                    {total = 13.95;
                    System.out.println("Your total charges are $"+total+ " for the month");}
                break;

            case 'C':
            case 'c':
                {total = 19.95;
                System.out.println("Your total charges are $"+total+ " for the month");}
                break;
                
            default:
               System.out.println("You have entered a incorrect input"); 


        }






    }
}
