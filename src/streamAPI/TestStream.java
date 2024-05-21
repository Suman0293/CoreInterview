package streamAPI;


import java.util.Arrays;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        String[] names = { "one", "two", "three", "three", "four" };

        Stream<String> s = Arrays.stream(names);

        /*
         * s.forEach(e -> { System.out.println(e); });
         */

        /*
         * s.sorted().forEach(e -> { System.out.println(e); });
         */

        /*
         * s.map(e -> e.toUpperCase()).forEach(e -> { System.out.println(e); });
         */

        s.filter(e -> e.startsWith("t")).map(e -> e.toUpperCase()).distinct().sorted().forEach(e -> {
            System.out.println(e);
        });

    }

}
