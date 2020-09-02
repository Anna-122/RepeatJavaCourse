package lesson9_1.inheritance;

public class Demo extends Reader  {
    public Demo( String surname, String library_card, String faculty, String phone_number, String data_ofBirth ) {
        super(surname, library_card, faculty, phone_number, data_ofBirth);
    }




    public static void main( String[] args ) {


        String surname [] = new String[4];
        surname[0] = "Goncharova";
        surname[1] = "Momov";
        surname[2] = "Popova";
        surname[3] = "Ronov";



        String libraryCard  [] = new String[4];

        libraryCard[0]="6785";
        libraryCard[1] = "87659";
        libraryCard[2] ="675839";
        libraryCard[3] = "0977";




















        Reader reader = new Reader(surname[0],libraryCard[0],"linguistics","56743289",
                "12.08.2001");
        Reader reader1 = new Reader(surname[1],libraryCard[1],"linguistics","509976543",
                "12.01.2000");



        takeBook(surname[0],3);
takeBook(" Приключения, Словарь, Энциклопедия\n");
takeBook("Приключения", " Tom Readly \n");
takeBook("Словарь"," Tom Puytr\n");
takeBook("Энциклопедия"," Anna Tory\n");

returnBook(surname[0],3);
        System.out.print("\n");



takeBook(surname[1],1);
System.out.print("\n");
takeBook(" Собака Баскервили \n");
takeBook("Шерлок Холмс"," Собака Баскервили \n ");


returnBook(surname[1],1);
returnBook("Шерлок Холмс ", " Собака Баскервили \n");


        takeBook(surname[2],1);
        System.out.print("\n");
        takeBook( " Собака Баскервили \n");


    }
}
