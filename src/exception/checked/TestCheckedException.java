package exception.checked;

public class TestCheckedException {

    public static void main(String[] args) {
        dad();
    }
    public static void dad() {
        try {
            mom();
        } catch (CheckedException e) {
            System.out.println(e);
        }
    }
    public static void mom() throws CheckedException {
        son();
    }
    public static void son() throws CheckedException {
        throw new CheckedException();
    }

}