package andr.maven.andr.lec_3.homework.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int tableWidth = 3;
        int tableLength = 10;
        int[][] tableArray = new int[tableWidth][tableLength];

        for (int i = 1; i < tableArray.length; ++i) {
            for (int j = 1; j < tableArray[i].length; ++j) {
                tableArray[i][j] = i * j;
            }
        }
        for (int[] row : tableArray) {
            for (int element : row) {
                if (element < 10) {
                    System.out.print(' ');
                }
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}
