package andr.lec_2.homework.task_5;

public class Inches2 {
    public static void main(String[] args) {
        System.out.println("Inches" + " | " + "Santimetres");
        double inch;
        for (inch = 1; inch <= 20; inch++) {
            double res2Print = inch * 2.54;

            System.out.println(inch + " sm = " + res2Print + " inches ");
        }

    }
}