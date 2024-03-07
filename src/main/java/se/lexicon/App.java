package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App
{
    public static void main( String[] args )
    {

       ex01();
    }

    public static void ex01() {
        LocalDate currentDate = LocalDate.now();
        System.out.println();
        System.out.println(currentDate);
        ex02();
    }

    public static void ex02() {
        LocalDate currentDate = LocalDate.now();
        String custom = currentDate.format(DateTimeFormatter.ofPattern("eeee dd MMM yyyy"));
        System.out.println();
        System.out.println(custom);
        ex03();

    }

    public static void ex03() {
        LocalDate lastMonday = LocalDate.of(2024,3,4);
        System.out.println();
        for (int i = 0; i < 7; i++) {
            LocalDate nextDate = lastMonday.plusDays(i);
            System.out.print(nextDate +" \n");
        }
        ex04();
    }

    public static void ex04() {
        String date = "2024-03-07";
        LocalDate today = LocalDate.parse(date);
        System.out.println();
        System.out.println(today);
    }
}
