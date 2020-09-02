package DataTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class LocalDate_hm {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

            int year = today.getYear();
            int month = today.getMonthValue();
            Month monthAsEnum = today.getMonth(); // как перечисление
            int dayYear = today.getDayOfYear();
            int dayMonth = today.getDayOfMonth();
            DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

            System.out.println("Год: " + year);
            System.out.println("Месяц: " + month);
            System.out.println("Название месяца: " + monthAsEnum);
            System.out.println("День в году: " + dayYear);
            System.out.println("День месяца: " + dayMonth);
            System.out.println("День недели: " + dayWeekEnum);

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
