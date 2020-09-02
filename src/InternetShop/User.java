package InternetShop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class User extends Category {
    public static void main( String[] args ) {
//        scanner();
    //   choose_catalog();

       choose_goods();


    }


    public static void scanner() {
        System.out.print("Введите login : ");
        Scanner scan1 = new Scanner(System.in);
        String login = scan1.nextLine();
        System.out.println("Вы ввели login " + login);

        System.out.print("Введите password : ");
        Scanner scan2 = new Scanner(System.in);
        String password = scan2.nextLine();
        System.out.println("Вы ввели password :" + password);

        System.out.println("Отлично! Спасибо за регестрацию ");
    }


    public static void choose_catalog() {
        System.out.println(" Выберите каталог для просмотра. 0 - Просмотр всех каталогов." +
                " 1 - Уход за собой. Косметика. 2 - Одежда. 3 - Детские товары.");
        Scanner scan3 = new Scanner(System.in);
        Integer goods = scan3.nextInt();
        if (goods == 1) {
            System.out.print("Вы вибрали каталог - Уход за собой . Косметика");
            ArrayList<String> cosmetics = new ArrayList<>();
            cosmetics.add("lipstick");
            cosmetics.add("powder");
            cosmetics.add("face_cream");
            cosmetics.add("ing");
            cosmetics.add("base_cream");


            for (String s : cosmetics) {
                System.out.println("\n" + s + "\n");
            }

        } else if (goods == 2) {
            System.out.print("Вы вибрали каталог - Одежда");


            ArrayList<String> clothes = new ArrayList<>();
            clothes.add("skirt");
            clothes.add("pants");
            clothes.add("blouse");
            clothes.add("swimsuit");
            clothes.add("jacket");


            for (String s : clothes) {
                System.out.println("\n" + s + "\n");
            }


        } else if (goods == 3) {
            System.out.print("Вы вибрали каталог - Детские товары");

            ArrayList<String> children_goods = new ArrayList<>();
            children_goods.add("toy");
            children_goods.add("teddy_bear");
            children_goods.add("baby_powder");


            for (String s : children_goods) {
                System.out.println("\n" + s + "\n");
            }


        } else if (goods == 0) {
            System.out.print("Вы вибрали просмотр всех каталогов");
             ArrayList<String> goods_list = new ArrayList<>();
            System.out.println(" 1. Уход за собой . Косметика");
            goods_list.add("lipstick");
            goods_list.add("powder");
            goods_list.add("face_cream");
            goods_list.add("ing");
            goods_list.add("base_cream");

            for (String s : goods_list) {
                System.out.println("\n" + s + "\n");
            }
            System.out.println(" 2. Одежда");
            goods_list.add("skirt");
            goods_list.add("pants");
            goods_list.add("blouse");
            goods_list.add("swimsuit");
            goods_list.add("jacket");

            for (String s : goods_list) {
                System.out.println("\n" + s + "\n");
            }

            System.out.println(" 3. Одежда");
            goods_list.add("toy");
            goods_list.add("teddy_bear");
            goods_list.add("baby_powder");


            for (String s : goods_list) {
                System.out.println("\n" + s + "\n");
            }


        }



    }

    public static void choose_goods() {

        System.out.println("Выберите товар(ы) для перемещения в корзину, написав название товара");

        Scanner scan = new Scanner(System.in);
        String goods = scan.nextLine();
        System.out.println("Вы выбрали товар " + goods);


        goods_list.add("lipstick");
        goods_list.add("powder");
        goods_list.add("face_cream");
        goods_list.add("ing");
        goods_list.add("base_cream");




        goods_list.add("skirt");
        goods_list.add("pants");
        goods_list.add("blouse");
        goods_list.add("swimsuit");
        goods_list.add("jacket");


        goods_list.add("toy");
        goods_list.add("teddy_bear");
        goods_list.add("baby_powder");


        System.out.print(goods_list.size());

        System.out.print(" ");

        for (int i=0; i<goods_list.size(); i++) {
        }
            if (goods_list.contains(goods)) {
                System.out.println(" Вы выбрали :  " + goods);
                System.out.println("Отлично! Товар в наличии ");


                for(int i = 0; i < goods_list.size(); i++) {

                    //Goods goods1 = new Goods();
                    ArrayList<String> basket_goods = new ArrayList<String>();
                    basket_goods.add(goods);

                }

                    System.out.println(" Перемещаем товар  в корзину.  Ваш товар : " + goods);





            } else {
                System.out.println("Такого товара не существует");

            }

            String goods2 = goods;
            String[] words = goods2.split("\\d*(\\d|,|)\\d*");
            for (String your_goods : words) {
                System.out.println("----------" + your_goods);
            }


            for (int i = 0; i < goods.length(); i++) {
                Goods goods1 = new Goods();
            }


        }

}


//
//    int size = scan.nextInt();//Читаем с клавиатуры размер массива и записываем в size
//    int array[] = new int[size]; //Создаём массив int размером в size
//                for (int i = 0; i < size; i++) {
//        array[i] = scan.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
//        }
//        System.out.print ("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//        System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//        }
//        System.out.println();











    // for (int i=0; i<goods_list.size(); i++) {
    //System.out.println(goods_list.get(i));
//    boolean done = false;
//        while (!done) {
//                if (goods_list.equals(goods)) {
//                done = true;
//                System.out.println("Отлично! Товар в наличии ");
//                } else {
//                System.out.println("Такого товара не существует");
//
//                }
//
//                }


//
//for (int i=0; i<goods_list.size(); i++) {
//        System.out.println(goods_list.get(i));



//        if (goods_list.get(i).equals(goods)) {
//        System.out.println("Отлично! Товар в наличии ");
//        } else {
//        System.out.println("Такого товара не существует");
//        }
//        }




//  for (String s : goods_list) {
//          System.out.println(s);
//
//          if (s.equals(goods)) {
//          System.out.println("------");
//          } else {
//          System.out.println("Такого товара не существует");
//          }
//          }





















//    int a = Integer.parseInt(goods);
//        System.out.println(a);
//                int i =2;
//                if( a == 1 ){
//                ArrayList<String> basket_goods = new ArrayList<String>();
//
//        basket_goods.add(goods);
//
//        }else if( a >goods.length() ){
//        System.out.print("Невозможное количество товаров");
//
//        }else if( a  >= i ){
//
//        ArrayList<String> basket_goods = new ArrayList<String>();
//
//        basket_goods.add(goods); i++ ;
//        Integer.toString(i);
//
//        System.out.println(" Вы выбрали :  "+ i);
//
//        }



//    public static void choose_goods(){
//
//        System.out.println("Выберите товар(ы) для перемещения в корзину, написав название товара");
//
//        Scanner scan = new Scanner(System.in);
//        String goods = scan.nextLine();
//        System.out.println("Вы выбрали товар " + goods);
//
//
//
//        ArrayList<String> basket_goods = new ArrayList<String>();
//        for (int i = 0; i < basket_goods.size(); i++) {
//            basket_goods.add(goods);
//
//            System.out.println(" Вы выбрали :  " + goods);
//        }
//        System.out.println(" Перемещаем товар  в корзину.  Ваш товар : "+ goods) ;
//
//
//    }