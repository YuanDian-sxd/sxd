package day1.test;

import java.util.Calendar;

public class test1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        cal.add(Calendar.DATE,3);
        System.out.println(cal);
    }
}
