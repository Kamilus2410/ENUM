import java.util.Arrays;

public class Zadania {

    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value.name() + "(" + value.getShorten() + ") " + "is working day? :" + value.isWorkingDay() + " is weekend? : " + value.isWeekend());
        }
        System.out.println();
        DancingClass[] dances = DancingClass.values();
        for (DancingClass dancingClass : dances) {
            System.out.println(dancingClass.name() + ": possible hours: " + Arrays.toString(dancingClass.getTime()) +
                   " days: " + dancingClass.getDayFirst() + ", " + dancingClass.getDaySecond() + ", alternative: " + dancingClass.alternative());
        }
    }
}
