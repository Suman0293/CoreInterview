package oops.shape;

public class B extends A {
    public String address;

    public B(int id, String fname, String lname, String address) {
        super(id, fname);
        this.address = address;
        System.out.println(id + fname + lname + address);
    }
}
