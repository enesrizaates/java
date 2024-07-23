public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ice1 = new IceCream("Chocolate", 15, 3);
        IceCream ice2 = new IceCream("Strawberry", 2, 3);
        ice1.addTopping("nuts");
        ice1.addTopping("cherries");
        ice1.printToppings();
        ice2.addTopping("sprinkles");
        ice2.printToppings();
    }
}
