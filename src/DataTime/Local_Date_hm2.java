package DataTime;


import java.time.LocalDate;
import java.time.Month;
public class Local_Date_hm2 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2020, Month.AUGUST, 4);
        System.out.println(today);
        System.out.println(" ");

        LocalDate my_birthday = LocalDate.of(2001, Month.AUGUST, 12);
        System.out.println(my_birthday);

        boolean after = today.isAfter(my_birthday);
        boolean before = today.isBefore(my_birthday);
        boolean equal = today.equals(my_birthday);


        System.out.println("today.isAfter(my_birthday): " + after);
        System.out.println("today.isBefore(my_birthday): " + before);
        System.out.println("today.equals(my_birthday): " + equal);

    }
}