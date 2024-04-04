package javabasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        System.out.print(str);
    }
}
