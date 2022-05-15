package andr.maven.andr.lec_3.homework.task_1;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Enter 3 numbers to get it's sum: ");
        System.out.println("Enter number 1: ");
        int entered1 = scannerIn.nextInt();
        System.out.println("You entered number: " + entered1);

        System.out.println("Enter number 2: ");
        int entered2 = scannerIn.nextInt();
        System.out.println("You entered number: " + entered2);

        System.out.println("Enter number 3: ");
        int entered3 = scannerIn.nextInt();
        System.out.println("You entered number: " + entered3);
        int enteredSum = entered1+entered2+entered3;
        System.out.println("The sum of all entered numbers is: " + enteredSum);

//        int enteredSum = scannerIn.nextInt()+scannerIn.nextInt()+scannerIn.nextInt();
//        System.out.println("The sum of the numbers You entered is: " + enteredSum);
    }
}
