import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> myNumList = new ArrayList<>();
        myNumList.add(1);
        myNumList.add(2);
        myNumList.add(3);
        myNumList.add(4);
        myNumList.add(5);

        list.add("John");
        list.add("Kyle");
        list.add("Matthew");
        list.add("Amanda");
        list.add("Wendy");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(myNumList.get(i) + ". ");
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
