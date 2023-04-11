package view;

import customer.Cart;
import customer.CartController;
import item.Item;

import java.util.List;

public class CartViewer {
    public static CartController controller;

    // 장바구니 목록 조회
    public static void myCart() {
        System.out.println(" ============ 장바구니 목록 ============ ");
        System.out.println("[리스트] [상품명] [단가] [수량] [합계]");
        List<Cart> cartlist = controller.getCartList();
        for (Cart cart : cartlist) {
            System.out.println(cart);
        }


        System.out.println(" ------------------------------------- ");
        System.out.println("장바구니 총 금액");

        System.out.println(" 1. 결제하기");
        System.out.println(" 2. ");





    }

    // 장바구니


}
