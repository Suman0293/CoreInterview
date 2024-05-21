package collection.comparable;

public class ComparableEx implements Comparable<ComparableEx> {
    public int rollno;
    public String name;
    public int marks;

    public ComparableEx(int r, String n, int m) {
        this.rollno = r;
        this.name = n;
        this.marks = m;
    }

    public int compareTo(ComparableEx e) {
        // return name.compareTo(e.name);//Sorting by name
        // return e.name.compareTo(name);//Desc order name
        // return e.rollno.compareTo(rollno);//Desc order rollno

        if (name.equals(e.name)) {
            return name.compareTo(e.name);
        } else {
            //return rollno - e.rollno;// asc me ayega rollno
            return e.rollno - rollno;// des me ayega rollno

        }//name  asc order me dega



//        if (name.equals(e.name)) {
//            return rollno - e.rollno;
//        } else {
//            //return e.name.compareTo(name);
//            return name.compareTo(e.name);
//        }  //name ko desc karega



//        if (name.equals(e.name)){
//            return rollno - e.rollno;
//        }else {
//            return rollno - e.rollno;
//        }// asc oreder me ayrga rollno
}

    public String toString() {
        //  return  rollno+name+marks;
        return "[rollno= " + rollno + "  " + "name=" + name + "  " + "marks= " + marks + "]";
    }
}
