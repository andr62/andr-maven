package andr.lec_1.classwork.point_6;
    public class JavaOperators {
        public static void main(String[] args) {
            int myInt_1 = 33;
            int myint_2 = 44;
            int sum = myInt_1 + myint_2;
            System.out.println(myInt_1 + myint_2);
            System.out.println(sum);

            System.out.println("3/5=" + 3 / 5);
            System.out.println("3/5.0=" + 3 / 5.0); // Int + Double -> Dobule ( наибольший тип )
            System.out.println("3>5=" + (3 > 5));
            System.out.println("3==5" + (3 == 5));
            System.out.println("3!=5 ->" + (3 != 5));

            int x = 0;
            System.out.println("x=" + x)  ; // переменная типа "х" + 1 -> выводим на экран
            x = x + 1;

            x++; // ++x
            System.out.println("x=" + x);

            x += 1; // x = x +1;

            System.out.println(8.0 / 4.0); // с даблами нельзя использовать простые выражения

            System.out.println("8<<3=" + (8 << 3));
            System.out.println("8>>4=" + (8 >> 3));
            System.out.println("7 % 5=" + 7 % 5);
            }
        }