package lesson9;

public class Iphone extends Phone {
    int number;
    String model;
    float weight;
    String color;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public void setWeight( float weight ) {
        this.weight = weight;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public Iphone( int number, String model, float weight, String color) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.color = color;
        receiveCall("Anna");
        getNumber(154333987);

    }



}

