package oops;

public class MyName {

    public static int id;
    public String name;

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        MyName my = new MyName();
        my.id = 101;
        my.name = "Suman";
        System.out.println(my.getId());
        System.out.println(my.getName());
    }


}
