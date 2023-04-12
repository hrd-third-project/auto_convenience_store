package customer;

import item.Item;

import java.util.ArrayList;
import java.util.List;


public class CartController {
    private Cart mycart;

    // 테스트용
    private static List<Cart> cartlist = new ArrayList<>();
//    static {
//        cartlist.add(new Cart(new Item("콘칲", 1000, 10), 1));
//        cartlist.add(new Cart(new Item("홈런볼", 1500, 10), 1));
//        cartlist.add(new Cart(new Item("키켓", 2000, 10), 1));
//    }


    public static List<Cart> getCartList() {

        return cartlist;
    }






}
