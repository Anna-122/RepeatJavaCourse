package lesson9_1.inheritance;

import java.util.Scanner;

public class Reader {


    String surname,library_card,faculty,phone_number,data_ofBirth;

    public Reader( String surname, String library_card, String faculty, String phone_number, String data_ofBirth ) {
        this.surname = surname;
        this.library_card = library_card;
        this.faculty = faculty;
        this.phone_number = phone_number;
        this.data_ofBirth = data_ofBirth;
        System.out.print(this.surname);
    }




    public static void takeBook(String surname,int count_book){

        System.out.print( surname + " взял(a)"+count_book + " книги ");

    }


    public static void takeBook(String name_book){
        System.out.print( " взял(a)" + name_book );

    }


    public static void takeBook(String name_book,String name_author){
        System.out.print( " взял(a)" + name_book + name_author );

    }






    public static void  returnBook(String surname,int count_book){
        System.out.print(surname + " вернул(а) " + count_book + " " + " книги (y)");
    }

    public static void  returnBook(String name_book){
        System.out.print(" вернул(а) " + name_book  + " ");
    }


    public static void  returnBook(String name_book,String name_author){
        System.out.print(" вернул(а) " + name_book + name_author  + " ");

    }

    public static void scanner( int y){

        System.out.print("Введите любое целое число: 1 - добавить читателя; 2   : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);
    }
}
