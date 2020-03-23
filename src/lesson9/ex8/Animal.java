/*
 Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
  \Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
  Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив типа Animal,\
  в который запишите животных всех имеющихся у вас типов.
   В цикле отправляйте их на прием к ветеринару.


*/

package lesson9.ex8;

public class Animal {


    public Animal( String food, String location ) {
    }

    public static void main( String[] args ) {
        String food, location;

        }

    public Animal() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals( Object obj ) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void makeNoise( String noise ) {

      //  System.out.print("Это животное издает звуки:" + noise);
    }

    public  static void eat( String food ) {

      //  System.out.print("Это животное ест:" + food);
    }

    public static void sleep( String animal ) {

      //  System.out.print(animal + "спит очень сладко" );
    }

        Animal animal1 = new Animal();


}