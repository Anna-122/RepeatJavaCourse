package InternetShop;

public class Children_goods  extends  Category {

    public Children_goods( String category_name, Double price ) {
        super(category_name);
    }

    public Children_goods() {
    }

    public Children_goods( String toy ) {
    }


         String guarantee;

    public Children_goods( String category_name, Double price, String guarantee ) {
        super(category_name);
        this.guarantee = guarantee;

    }


    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee( String guarantee ) {
        this.guarantee = guarantee;
    }


}
