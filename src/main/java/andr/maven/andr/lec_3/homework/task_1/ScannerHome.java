package andr.maven.andr.lec_3.homework.task_1;

//Task 1
//        Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
//        Вывести сумму, наименьшее и наибольшее из чисел на экран

import java.util.Arrays;
import java.util.Scanner;

public class ScannerHome {
    public static void main(String[] args) {
        System.out.println("This program will calculate the sum of numbers You enter below. Enter any number three times: ");
        int[] array = new int[3];
        int usersSum = 0;
        Scanner usersChoice = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter elements of the array: ");
            array[i] = usersChoice.nextInt();
            usersSum = usersSum + array[i];

            int min = array[0];
            int max = array[0];
            for (int elem : array) {
                if (elem < min) {
                    min = elem;
                }
                if (elem > max) {
                    max = elem;
                }
            }

            System.out.println("Min element " + min);
            System.out.println("Max element " + max);
        }
            System.out.println(Arrays.toString(array));
            System.out.println("The sum of numbers You entered is " + usersSum);


//        int number1 = usersChoice.nextInt();
//        int number2 = usersChoice.nextInt();
//        int number3 = usersChoice.nextInt();

        }
    }

//        int[] array = new int[3];
//        for (int i = 0; i < array.length; i++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter your number: ");
//            int numberFromInput1 = scanner.nextInt();
//
//            String name = scanner.next();
//            int numberFromInput2 = scanner.nextInt();
//
//
//            int numberFromInput3 = scanner.nextInt();
//            System.out.println(numberFromInput1+numberFromInput2+numberFromInput3);
//        }
//    }
//}
