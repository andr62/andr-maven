package andr.maven.andr.lec_3.homework.task_2;
import java.util.Scanner;
import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        double summ = 0;
        double mean = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] arrayMean = new int[arrayLength];

        for (int i = 0; i < arrayMean.length; i++) {
            arrayMean[i] = i;
            summ = summ + arrayMean[i];
        }
        mean = summ / arrayMean.length;

        System.out.println("Final array " + Arrays.toString(arrayMean));
        System.out.println("Summ " + summ);
        System.out.println("Arithmetic mean " + mean);
    }
}