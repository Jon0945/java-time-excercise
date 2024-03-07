package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App
{
    public static void main( String[] args )
    {

       ex01();
    }

    /** Working with LocalDate **/

    public static void ex01() {
        //Create a LocalDate of the current day and print it out
        LocalDate currentDate = LocalDate.now();
        System.out.println();
        System.out.println(currentDate);
        ex02();
    }

    public static void ex02() {
        //Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter:
        // Torsdag 29 mars.
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
        ex07();
    }

    public static void ex07() {
        //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date
        // from exercise 5. Print out the elapsed years, months and days.
        LocalDate myBirthDay = LocalDate.of(1978,5,10);
        LocalDate date = LocalDate.now().plusYears(10).minusMonths(10);
        Period period = Period.between(myBirthDay,date);
        System.out.println();
        System.out.println(period.getYears() + " years , " + period.getMonths() + " months , " + period.getDays() + " days");
        ex08();
    }

    public static void ex08() {
        //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and
        // add the period you created to the current date.
        Period period = Period.of(4,7,29);
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plus(period);
        System.out.println();
        System.out.println(newDate);
        ex09();
    }

    /** Working with LocalTime **/

    public static void ex09() {
        //Create a LocalTime object of the current time.
        LocalTime currentTime = LocalTime.now();
        System.out.println();
        System.out.println(currentTime);
        ex10();
    }
    public static void ex10() {
        //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        LocalTime currentTime = LocalTime.now();
        System.out.println();
        System.out.println(currentTime.getNano());
        ex11();
    }

    public static void ex11() {
        // Create a LocalTime object from a String using the .parse() method.
        String time = "13:50:26";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println();
        System.out.println(localTime);
        ex12();
    }

    public static void ex12() {
        // Using DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53
        LocalTime currentTime = LocalTime.now();
        String custom = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println();
        System.out.println(custom);
        ex13();
    }

    /** Working with LocalDateTime **/

    public static void ex13() {
        //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00
        LocalDateTime dateTime = LocalDateTime.of(2018,4,5,10,0);
        System.out.println();
        System.out.println(dateTime);
        ex14();
    }

    public static void ex14() {
        //Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String
        // that should look like this: torsdag 5 april 10:00
        LocalDateTime dateTime = LocalDateTime.of(2018,4,5,10,0);
        String custom = dateTime.format(DateTimeFormatter.ofPattern("eeee d MMMM HH:mm"));
        System.out.println();
        System.out.println(custom);


    }
}
