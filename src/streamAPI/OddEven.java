package streamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static boolean oddEven(int i) {

        if (i % 2 == 0) {
            System.out.println(i + " = even ");
            return true;

        } else if (i % 2 != 0) {
            System.out.println(i + " = odd ");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
       // list.stream().distinct().filter(c -> oddEven(c)).forEach(c -> System.out.println());
        list.stream().distinct().filter(e -> (e % 2 == 0)).forEach(e -> System.out.println("even = " + e));
        list.stream().distinct().filter(e -> (e % 2 != 0)).forEach(e -> System.out.println("odd = " + e));
    }
}
