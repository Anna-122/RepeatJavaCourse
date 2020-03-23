package lesson10;

public abstract class Apple extends Fruct {

    public Apple(double price, double weight) {
     super(price,weight);



    }

    @Override
    public void Costcalculation( double price, double weight ) {
        System.out.print(weight*price/2);
    }
}
