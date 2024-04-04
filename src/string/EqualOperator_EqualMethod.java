package string;

public class EqualOperator_EqualMethod {

    public static void main(String[] args) {

        String name1 = "Suman";
        String name2 = "Suman";
        String name3 = "Bhardwaj";
        String name4 = new String("Suman");
        String name5 = new String("Bhardwaj");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 == name4);
        System.out.println(name1 == name5);

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name4));
        System.out.println(name1.equals(name5));

    }

}
