package customer;

import item.Item;

import java.util.ArrayList;
import java.util.List;


public class CartController {

    private Cart mycart;

    // 테스트용
    private static List<Item> cartlist;

    static {
        cartlist = new ArrayList<>();
    }

    public static void setCartlist(Item item) {
        cartlist = cartlist;
    }

    public static List<Item> getCartList() {

        return cartlist;
    }






}
