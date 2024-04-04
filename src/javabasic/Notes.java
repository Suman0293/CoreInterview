package javabasic;

public class Notes {

    public static void main(String[] args) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int t = 4551;
        int count;

        for (int i = 0; i < notes.length; i++) {
            count = t / notes[i];

            if (count > 0) {
                System.out.println(notes[i] + " = " + count );
                t = t % notes[i];
            }
        }

    }
}
