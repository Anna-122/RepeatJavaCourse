package lesson9.ex8;

public class Cat extends  Animal {

        boolean tale;

public boolean isTale() {
        return tale;
        }

public void setTale( boolean tale ) {
        this.tale = tale;
        }


public Cat( String food, String location, boolean tale ) {
        super(food, location);
        this.tale = tale;
        }

}