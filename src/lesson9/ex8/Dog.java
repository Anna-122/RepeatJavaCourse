package lesson9.ex8;

public class Dog extends Animal {

    String color;

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public Dog( String food, String location, String color ) {
        super(food, location);
        this.color = color;

    }
}