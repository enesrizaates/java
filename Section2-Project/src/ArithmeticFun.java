package src;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // e.g BINARY operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("result is " + result);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is now " + remainder);

        result += 20;  // result = result + 20
        System.out.println("result is " + result);

        // UNARY operators
        ++result;
        System.out.println("result is at last " + result);
        --result;
        System.out.println("result is at last " + result);

        product *= 2;
        System.out.println("product is " + product);

    }
}
