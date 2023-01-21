package Task2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ImmutableLists<Integer> list1 = new ImmutableLists<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(list1.get(1));
        System.out.println(list1.getSize());
        System.out.println(list1);

        System.out.println("-------");

        MutableLists<Integer> list2 = new MutableLists<Integer>(Arrays.asList(1,2,3,4));
        list2.add(5);
        System.out.println(list2);

        list2.set(4, 1);
        System.out.println(list2);

        list2.remove(1);
        System.out.println(list2);

        System.out.println(list2.get(1));
        System.out.println(list2.getSize());    
    }
}
