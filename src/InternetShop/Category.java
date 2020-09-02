package InternetShop;

import java.util.ArrayList;

public class Category {



    String category_name;
  //нужен массив товаров

    static ArrayList<String> goods_list = new ArrayList<>();
    goods_list lipstick = new goods_list("lipstick");
    goods_list powder = new goods_list("powder");
    goods_list face_cream = new goods_list("face_cream");
    goods_list ing = new goods_list("ing");
    goods_list base_cream = new goods_list("base_cream");

    goods_list skirt = new goods_list("skirt");
    goods_list pants = new goods_list("pants");
    goods_list blouse = new goods_list("blouse");
    goods_list swimsuit = new goods_list("swimsuit");
    goods_list jacket = new goods_list("jacket");



    goods_list toy = new goods_list("toy");
    goods_list teddy_bear = new goods_list("teddy_bear");
    goods_list baby_powder = new goods_list("baby_powder");




    public Category( String category_name ) {
        this.category_name = category_name;

    }

    public Category() {

    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name( String category_name ) {
        this.category_name = category_name;
    }




}




