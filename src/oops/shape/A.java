package oops.shape;

public class A {
    private int id;
    private String fname;
    private String lname;


    public A(int id, String fname){
        this.id=id;
        this.fname=fname;
        System.out.println(id + fname);
    }

    public A(int id, String fname, String lname){
        this.id=id;
        this.fname=fname;
        this.lname=lname;
        System.out.println(id + fname + lname);
    }
}
