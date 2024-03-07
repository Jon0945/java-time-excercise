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
        //Create a LocalDate of the current day and print it out
        LocalDate currentDate = LocalDate.now();
        System.out.println();
        System.out.println(currentDate);
        ex02();
    }

    public static void ex02() {
        //Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter:
        /** Torsdag 29 mars. **/
        LocalDate currentDate = LocalDate.now();
        String custom = currentDate.format(DateTimeFormatter.ofPattern("eeee dd MMM yyyy"));
        System.out.println();
        System.out.println(custom);
        ex03();

    }

    public static void ex03() {
        //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format
        LocalDate lastMonday = LocalDate.of(2024,3,4);
        System.out.println();
        for (int i = 0; i < 7; i++) {
            LocalDate nextDate = lastMonday.plusDays(i);
            System.out.print(nextDate +" \n");
        }
        ex04();
    }

    public static void ex04() {
        //Create a LocalDate object from a String by using the .parse() method.
        String date = "2024-03-07";
        LocalDate today = LocalDate.parse(date);
        System.out.println();
        System.out.println(today);
        ex05();
    }

    public static void ex05() {
        //Create a LocalDate of your birthday and extract the day of week for that date.
        LocalDate myBirthDay = LocalDate.of(1978,5,10);
        System.out.println();
        System.out.println(myBirthDay.getDayOfWeek());
        ex06();
    }

    public static void ex06() {
        //Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.
        LocalDate date = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println();
        System.out.println(date.getMonth());

    }
}
