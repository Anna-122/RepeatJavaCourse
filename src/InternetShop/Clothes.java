package InternetShop;

public class Clothes extends Category {
    public Clothes( String skirt ) {
    }


        int size;
        String colour;

    public Clothes( String category_name, Double price, int size, String colour ) {
        super(category_name);
        this.size = size;
        this.colour = colour;
    }

    public Clothes( int size, String colour ) {
        this.size = size;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize( int size ) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour( String colour ) {
        this.colour = colour;
    }
}
