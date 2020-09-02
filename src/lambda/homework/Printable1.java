package lambda.homework;


import static lambda.homework.Printable.*;

public class Printable1 {
    public static void main( String[] args ) {



            Printable op = new Printable(){


                public int calculate(int x, int y){

                    return x + y;


                }
            };


        int z = Printable.calculate(20, 10);
            System.out.println(z); // 30
        }
    }


