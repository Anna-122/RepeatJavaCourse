package lesson10;

public class Apricot extends Fruct {

    public Apricot( double price, double weight ) {
        super(price, weight);
    }

    @Override
    public void Costcalculation( double price, double weight ) {
        System.out.print(weight*price/2);
    }
}

