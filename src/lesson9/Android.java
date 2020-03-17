package lesson9;

public class Android extends Phone {
    int number;
    String model;
    float weight;
    String color;
    float lenght;

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

    public float getLenght() {
        return lenght;
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

    public void setLenght( float lenght ) {
        this.lenght = lenght;
    }

    public Android( int number, String model, float weight, String color, float lenght ) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.lenght = lenght;



        receiveCall("Dasha");
        getNumber(012745667);

    }



}