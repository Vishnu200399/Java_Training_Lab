package DS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class TestDateTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2024,03,11);
        System.out.println(ld1);
        System.out.println(ld1.plusMonths(1));
        System.out.println(ld1.minusDays(5));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:YYYY");
        System.out.println(dtf.format(ld1));

       LocalDateTime now = LocalDateTime.now();
       System.out.println("Before Formatting:"+now);
       DateTimeFormatter foramt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       String formatDateTime = now.format(foramt);
       System.out.println("After Formatting:"+formatDateTime);

       LocalDateTime a = LocalDateTime.of(2017,2,13,15,56);
       System.out.println(ChronoField.DAY_OF_WEEK);
       System.out.println(ChronoField.DAY_OF_YEAR);
       

    }
    
}
