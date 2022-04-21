package andr.lec_2.homework.task_3;

public class TotalSum {
    public static void main(String[] args) {
        int startNumber = 1;
        int sumNumbers = 0;
        for (startNumber = 1; startNumber <= 256; startNumber = startNumber * 2) ;
        sumNumbers = sumNumbers + startNumber;
        System.out.println("Total sum of 2' degree's " + sumNumbers);


    }
}