package andr.lec_2.homework.task_7;

public class EvenNumbers {
    public static void main(String[] args) {
        int firstEven = 1;
        int evenSum = 0;
        for (firstEven = 1; firstEven < 100; firstEven++) {
            if (firstEven % 2 != 0) {
                evenSum = firstEven + evenSum;
            }
        }
        System.out.println("Total Even's summary is " + evenSum);
    }
}
