package andr.lec_2.homework.task_6;

public class OddNumbers {
    public static void main(String[] args) {
        int firstOdd;
        for (firstOdd = 2; firstOdd <= 100; ++firstOdd) {
            if (firstOdd % 2 == 0) {
                System.out.println(firstOdd + " percent loading ");
            }
        }
    }
}
