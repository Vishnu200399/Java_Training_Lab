package DS;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TestCalender{
    public static void main(String[] args) {
        GregorianCalendar c1 = new GregorianCalendar();
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
        c1.add(Calendar.MONTH,2);
        c1.set(Calendar.MONTH,2);
        c1.clear();
        System.out.println(c1);
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
        System.out.println(c1.isLeapYear(2000));

    }

}