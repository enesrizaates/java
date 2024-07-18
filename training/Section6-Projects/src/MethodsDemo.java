public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        double dResult;
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        dResult = square(5);
        System.out.println(dResult);
    }

    // void parameterless method
    public static void printHello() {
        System.out.println("Hello");
    }

    // void parameterized
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }

    // value returning parameterless method
    public static int giveMe10() {
        return 10;
    }

    // value returning parameterized method
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    public static double square(double num) {
        return num * num;
    }
}
