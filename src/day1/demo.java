package day1;

import java.util.Calendar;

public class demo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println("YEAR:"+ cal.get(Calendar.YEAR));
        System.out.println("MONTH:"+ (cal.get(Calendar.MONTH)+1));
        System.out.println("WEEK_OF_MONTH:"+ (cal.get(Calendar.DAY_OF_WEEK)-1));
        System.out.println("DATE:"+ cal.get(Calendar.DATE));
        System.out.println("HOUR:"+ cal.get(Calendar.HOUR));
        System.out.println("MINUTE:"+ cal.get(Calendar.MINUTE));
        System.out.println("SECOND:"+ cal.get(Calendar.SECOND));
    }
}
