package view;

import customer.Cart;
import customer.CartController;
import customer.Customer;
import item.Item;
import item.ItemController;
import payment.Payment;
import utility.Utility;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CartViewer {
    public CartController cc;
    private Cart cart;
    public ItemController ic;

    public CartViewer() {
        cc = new CartController();
        cart = new Cart();
        ic = new ItemController();
    }

    // 장바구니 목록 조회
    public void myCart() {

        // 장바구니 유무 확인
        List<Item> cartList = cc.getCartList();
        boolean flag = cartList.stream()
                .anyMatch(item -> item.getNum() > 0);

        if (flag) {
            System.out.println("\n ┌───────────────── 장바구니목록 ─────────────────┐  ");
            System.out.println(" │      상품명       단가       수량      합계     │");
            System.out.println(" │ -------------------------------------------- │");

            List<Item> itemList = cc.getCartList();

            boolean itemCount = itemList.stream()
                    .anyMatch(item -> item.getNum() == 0);


            if (!itemCount) {
                List<Item> distincList = cartList.stream()  //itemList -> cartList
                        .distinct()
                        .collect(Collectors.toList());
                for (Item item : distincList) {
                    System.out.print(" │ \t\t" + item.getItemName() + "\t\t");
                    System.out.print(item.getPrice() + "\t\t");
                    System.out.print(10 -item.getNum() + "\t\t"); //
                    System.out.println(item.getPrice() * (10 - item.getNum()) + "\t│");
                }
            }


            System.out.println(" │ -------------------------------------------- │");

            NumberFormat formatter = new DecimalFormat("#,###");
            int sum = 0;
            for (Item myCartItem : itemList) {
                sum += myCartItem.getPrice();
            }

            System.out.println(" │    \t\t[ 장바구니 총 금액 : " + formatter.format(sum) + "원 ]\t\t    │");

            System.out.println(" └──────────────────────────────────────────────┘  ");


            System.out.println(" * 삭제하고자 하는 품목이 있다면 '1'을 눌러주세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String delItem = Utility.input("  >> ");
            switch (delItem) {
                case "1":
                    cc.deleteItem();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
                    break;

            }
        } else {
            System.out.println(" * 장바구니가 비어 있습니다!");
            Utility.stop();
        }


    }


}


