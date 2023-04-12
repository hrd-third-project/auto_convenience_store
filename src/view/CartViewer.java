package view;

import customer.Cart;
import customer.CartController;
import item.Item;
import item.ItemController;
import utility.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class CartViewer {
    public static CartController cc;
    private static Cart cart;
    public ItemController ic;


    // 장바구니 목록 조회
    public static void myCart() {
        System.out.println("\n\n ┌────────────────── 장바구니 목록 ──────────────────┓  ");
        System.out.println(" │      상품명        단가       수량      합계       │");
        System.out.println("\n │ ----------------------------------------------- │");

        List<Item> itemList = CartController.getCartList();

        List<Item> distincList = itemList.stream()
                .distinct()
                .collect(Collectors.toList());
        for (Item item : distincList) {
            System.out.println();
            System.out.print(" \t\t" + item.getItemName() + "\t\t");
            System.out.print(item.getPrice() + "\t\t");
            System.out.print(10 - item.getNum() + "\t\t");
            System.out.print(item.getPrice() * (10 - item.getNum()) + "\t   ");
        }


        System.out.println("\n │ ----------------------------------------------- │");
        int sum = 0;
        for (Item myCartItem : itemList) {
            sum += myCartItem.getPrice();
        }
        System.out.println(" │\t\t\t  [ 장바구니 총 금액 : " + sum + " ] \t\t\t  │");
        System.out.println(" └─────────────────────────────────────────────────┘  ");


        System.out.println(" # 1. 품목삭제 ");

        String menuNum = Utility.input(" - 메뉴 입력: ");
        switch (menuNum) {
            case "1":
//                CartController.deleteItem();
                break;
            case "2":
                break;
            case "0":
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
                break;
        }

    }


}


