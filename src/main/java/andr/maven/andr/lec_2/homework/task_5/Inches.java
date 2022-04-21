package andr.lec_2.homework.task_5;

public class Inches {
    public static void main(String[] args) {
        System.out.println("Дюймы, in" + " | " + " сантиметры, см ");
        double sm = 1;
        for (int inches = 1; inches <= 20; inches = inches + 1) {
            // создание переменной стоит вынести за пределы цикла. Зачем ее каждый раз создавать заново?
            sm = inches * 2.54;
            System.out.println(inches + " | " + sm);
        }
    }
}