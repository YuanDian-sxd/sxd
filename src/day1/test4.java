package day1.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入生产日期, 输入格式为:yyyy-MM-dd:");
        String fresh = scanner.nextLine();
        System.out.print("请输入保质期:");
        int t=scanner.nextInt();
        scanner.close();
        if (fresh.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
            Date date = sdf.parse(fresh);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE,t);
            cal.add(Calendar.WEEK_OF_MONTH,-2);
            cal.set(Calendar.DAY_OF_WEEK,4);
            Date time = cal.getTime();
            System.out.println(time);
        }else{
            System.out.println("输入格式错误");
        }
    }
}
