package andr.lec_2.homework.task_9;

public class paint {
    public static void main(String[] args) {

            for (int outer = 0; outer <= 4; outer++) {

                for (int space = 4; space > outer; space--) {
                    System.out.print(" ");
                }
                for (int sign = 0; sign <= outer - 1; sign++) {
                    System.out.print("**");
                }
                System.out.println();
            }
            for (int outer = 5; outer > 0; outer--) {
                for (int space = 5; space > outer; space--) {
                    System.out.print(" ");
                }
                for (int sign = 0; sign < outer - 1; sign++) {
                    System.out.print("**");
                }
                System.out.println();
            }
        }
    }