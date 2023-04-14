package customer;

import item.Item;
import item.ItemController;
import item.Snack;
import utility.Utility;
import view.CartViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CartController {

    private static List<Item> cartlist;

    static {
        cartlist = new ArrayList<>();
    }

    public ItemController ic;
    private Cart mycart;

    public static void setCartList(Item item) {
        cartlist = cartlist;
    }

    public static List<Item> getCartList() {
        return cartlist;
    }




    // 카트에 품목을 지우는 메서드
    public static List<Item> deleteItem() {
        List<Item> cartList = CartController.getCartList();

        String delItem = Utility.input("\n * 삭제하고자 하는 상품명을 입력하세요! ^0^ \n   >> ");

        // 삭제하고자 하는 상품이 카트리스트에 존재유무 확인
        boolean flag = cartList.stream()
                .anyMatch(item -> item.getItemName().equals(delItem));

        if (flag) {
            List<Item> removeItem = cartList.stream()
                    .filter(item -> item.getItemName().equals(delItem))
                    .limit(1)
                    .collect(Collectors.toList());

            
            System.out.println("removeItem = " + removeItem);
            System.out.println("cartList = " + cartList);
            // 해당 상품의 재고를 다시 1 추가
            for (Item item : removeItem) {
                item.setNum(item.getNum() + 1);
                System.out.println(item.getItemName() + "을/를 장바구니에서 삭제하였습니다.");
            }




            System.out.println("\n\n \t\t ********** 수정된 장바구니 목록 **********");

            CartViewer.myCart();

        } else {
            System.out.println("입력하신 상품은 장바구니에 존재하지 않습니다.");
        }


        return cartList;
    }


}
