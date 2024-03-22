package string;

public class RemoveSpecialCharFromString {

    public static void main(String[] args) {

        String name = "$%Su%^m#@a(*n";
        String name1 = name.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(name1);
    }
}
