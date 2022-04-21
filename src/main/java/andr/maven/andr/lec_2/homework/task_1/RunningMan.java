package andr.lec_2.homework.task_1;

public class RunningMan {
    public static void main(String[] args) {
        double zeroDayDist = 10;
        double everyDayDist = zeroDayDist;
        double totalTrackDist = everyDayDist + zeroDayDist;
        for (double days = 1; days < 8; days++) {
            everyDayDist = zeroDayDist + zeroDayDist / 10;
            totalTrackDist = totalTrackDist + everyDayDist;
        }
System.out.println("OverallDist is " + totalTrackDist + " km");

    }
}