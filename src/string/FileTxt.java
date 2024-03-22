package string;

public class FileTxt {
    public static void main(String[] agrs){

        String[] name = {"Hello.jpg", "Hello.txt", "Hello.doc", "Suman.txt"};

        for(int i=0; i<name.length; i++){
            if(name[i].endsWith(".txt")){
                System.out.println(name[i]);
            }
        }
    }
}
