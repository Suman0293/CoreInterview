package collection.smn;

public class EqualsHashCode {
    public int id;
    public String name;
    public int salary;
    public EqualsHashCode(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //hashcode will not apply in primitive data type
    @Override
    public int hashCode() {

        String str = this.id + this.name + this.salary;
        return str.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EqualsHashCode)) {
            return false;
        }
        EqualsHashCode d = (EqualsHashCode) obj;
        String s1 = this.id + this.name + this.salary;
        String s2 = d.id + d.name + d.salary;
        return s1.equals(s2);
    }

}