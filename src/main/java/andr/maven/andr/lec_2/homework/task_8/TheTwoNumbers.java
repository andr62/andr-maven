package andr.lec_2.homework.task_8;

public class TheTwoNumbers {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        int ttlSum = 0;
        for (int overallNumbers = 0; overallNumbers <=100; overallNumbers++) {
            if (overallNumbers % 2 != 0) {
                numberOne = numberOne + overallNumbers;
            } else {
                numberTwo = numberTwo + overallNumbers;
                ttlSum = numberOne + numberTwo;
            }
        }
        System.out.println("Overall Even's sum is " + numberOne);
        System.out.println("Overall Odd's sum is " + numberTwo);
        System.out.println("Total summ of all the numbers will be " + ttlSum);
    }
}
