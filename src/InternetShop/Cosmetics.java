package InternetShop;


public class Cosmetics extends Category {

    public Cosmetics( String lipstick ) {
        super();
    }


        boolean male_cosmetics;
        boolean female_cosmetics;

    public Cosmetics( String category_name, Double price, boolean male_cosmetics, boolean female_cosmetics ) {
        super(category_name);
        this.male_cosmetics = male_cosmetics;
        this.female_cosmetics = female_cosmetics;
    }

    public Cosmetics( boolean male_cosmetics, boolean female_cosmetics ) {
        this.male_cosmetics = male_cosmetics;
        this.female_cosmetics = female_cosmetics;
    }

    public boolean isMale_cosmetics() {
        return male_cosmetics;
    }

    public void setMale_cosmetics( boolean male_cosmetics ) {
        this.male_cosmetics = male_cosmetics;
    }

    public boolean isFemale_cosmetics() {
        return female_cosmetics;
    }

    public void setFemale_cosmetics( boolean female_cosmetics ) {
        this.female_cosmetics = female_cosmetics;
    }
}








