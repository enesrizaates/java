public class DaysofTheWeek {
    private enum DayOfWeek{
        MON,
        TUES,
        WED,
        THURS,
        FRI,
        SAT,
        SUN
    }
    public static void main(String[] args) {
        DayOfWeek theDay = DayOfWeek.SAT;
        if (isWeekday(theDay)) {
            System.out.println("It's a weekday");
        }
        else {
            System.out.println("Yay! It's the weekend!");
        }
    }

    public static boolean isWeekday(DayOfWeek day) {
        if (day != DayOfWeek.SAT && day != DayOfWeek.SUN) {
            return true;
        }
        else {
            return false;
        }
    }
}
