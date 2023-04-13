package payment;

import customer.CartController;
import customer.Customer;
import item.Item;
import view.StoreMain;

import java.util.List;

import static utility.Utility.stop;

public class Payment {


    private static Customer customer;
    private static int payment; //총금액


    public static void payCheck() {
        customer = new Customer();
        //선택한 품목이 1개이상인가
        if (CartController.getCartList().size() >= 1) {

            // cartList에 담겨있는 품목 +총금액

            for (Item item : CartController.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());

            }


            //Mycart 리스트에 담겨있는 품목 +총금액
            List<Item> cartList = CartController.getCartList();


            //결제하기 구입목록창
            System.out.println("\n\n ┌────────────────── 구입목록창 ──────────────────┓  ");
            System.out.println(" │        상품명            단가         수량   │");
            System.out.println("\n   │ ---------------------------------------------│");
            //구매목록=> (상품명 / 단가/ 수량)
            cartList.stream().forEach((Item n) -> System.out.println(n.getItemName()+"                         "
                                  +n.getPrice()+"          "+(10-n.getNum())));

            System.out.println("\n   │------------------------------------------- - │");


            //Mycart 리스테 담겨있는 총금액 계산
            //총금액 계산창


            System.out.println(" │\t\t\t  [ 총 결제금액 : " + customer.getPayment() + " ] \t\t\t  │");
            System.out.println(" └─────────────────────────────────────────────────┘  ");


            System.out.println("감사합니다! 또 이용해주세요.");
            stop();
            StoreMain.start();


            //cartList에  아무것도 담겨있지 않은 경우 -> 상품선택창으로 이동

        } else {
            System.out.println("상품을 선택해주세요");
            stop();
            StoreMain.selectCustomerMenu();
        }

    }


}