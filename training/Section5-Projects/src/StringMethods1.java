public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String myName = "Enes Riza Ates";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        if (name.equals(name2)) {
            System.out.print("Names are equal");
        }
        else {
            System.out.print("Names are not equal");
        }
        System.out.println();
        if (name.compareTo(name3) > 0) {
            System.out.print("name > name3");
        }
        else {
            System.out.print("name <= name3");
        }
        System.out.println();
        if (name.compareTo(myName) > 0) {
            System.out.print("name > myName");
        }
        else {
            System.out.print("name <= myName");
        }
    }
}
