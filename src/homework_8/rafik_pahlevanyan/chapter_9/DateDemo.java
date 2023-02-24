package homework_8.rafik_pahlevanyan.chapter_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date date = new Date();
        System.out.println(sdf.format(date));

        String dateStr = "01.03.2001";
        Date parse = sdf.parse(dateStr);
        System.out.println(parse);

    }
}