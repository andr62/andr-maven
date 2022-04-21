package andr.lec_2.homework.task_2;

public class AmoebaDoubles {
    public static void main(String[] args) {
        int Time = 0;
        int Amoeba = 1;

        do {
            System.out.println("Time spent " + Time + " hours " + " Amoeba's left " + Amoeba + " pcs");
            Time = Time + 3;
            Amoeba = Amoeba * 2;
        }
        while (Time <= 24);

        //for
        //i + 3
        //i = 0
        // переменная, которая будет содержать общее кол-во амеб,стартовое значение = 1
        // переменная*2
      //  int AmoebaStart = 0;
        //for (AmoebaStart)
      //  int AmoebaStart = 1;
      //  int AboebaOverall = AmoebaStart*2;


    }
}
