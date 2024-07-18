import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(10);

        int result = sumElements(myList);
        System.out.println(result);

    }

    public static int sumElements(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
