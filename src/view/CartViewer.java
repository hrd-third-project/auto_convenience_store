package view;

import customer.Cart;
import customer.CartController;
import item.Item;
import utility.Utility;

import java.util.List;

public class CartViewer {
    public static CartController controller;

    // 장바구니 목록 조회
    public static void myCart() {
        System.out.println(" ============ 장바구니 목록 ============ ");
        System.out.println("[리스트] [상품명] [단가] [수량] [합계]");
//        List<Cart> cartlist = controller.getCartList();
//        for (Cart cart : cartlist) {
//            System.out.println(cart);
//        }

//        List<Cart> cartList = (List<Cart>) Cart.getItem();
//        for (Cart item : cartList) {
//            System.out.println(item);
//        }


        System.out.println(" ------------------------------------- ");
        System.out.println("장바구니 총 금액");

        System.out.println(" # 1. 결제하기");
        System.out.println(" # 2. 상품 추가");
        System.out.println(" # 3. 상품 수정 및 삭제");
        System.out.println(" # 8. 이전 페이지");
        System.out.println(" # 9. 그냥 나가기");

        String menuNum = Utility.input(" - 메뉴 입력: ");
        switch (menuNum) {
            case "1":
                break;
            case "2":
                break;
            case "9":
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
                break;
        }

    }


}


