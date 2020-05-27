package objects_and_apis.date_and_time;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        /*
        Old API
        */
//        Date now = new Date();
//        System.out.println(now);
//
//        GregorianCalendar gc= new GregorianCalendar(2009, Calendar.JANUARY,28);
//        Date date = gc.getTime();
//        System.out.println(date);
//
//        gc.add(GregorianCalendar.DATE,5);
//        Date date2 = gc.getTime();
//        System.out.println(date2);
//
//        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
//        System.out.println(df.format(date2));

       /*
        New API
        */
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ld = LocalDate.of(2009, 3, 22);
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyy");
        System.out.println(dtf.format(ld));
    }
}
