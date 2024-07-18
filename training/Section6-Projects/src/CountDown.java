public class CountDown {
    public static void main(String[] args) {
//        countDownFrom(10);
        countUpTo(10, 20);
    }

    public static void countDownFrom(int num) {
        if (num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }

    public static void countUpTo(int starting, int ending) {
        if (starting <= ending) {
            System.out.println(starting);
            countUpTo(starting + 1 , ending);
        }
    }
}
