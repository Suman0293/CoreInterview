package collection.smn;

public class Marksheet {
    String name;
    String rollNo;
    int marks;

    public Marksheet(String name, String rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return rollNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals method");
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Marksheet)) {
            return false;
        }
        Marksheet m = (Marksheet) obj;
        return this.rollNo.equals(m.rollNo);
    }

    @Override
    public String toString() {
        return name + "," + rollNo + "," + marks;
    }

}
