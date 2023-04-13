package payment;

import customer.CartController;
import customer.Customer;
import customer.CustomerController;
import item.Item;
import view.StoreMain;

import java.util.List;

import static utility.Utility.stop;

public class Payment {


    private static Customer customer;
    private static int payment; //총금액


    public static void payCheck() {
//        customer = new Customer();
        //선택한 품목이 1개이상인가
        if (CartController.getCartList().size() >= 1) {

            // cartList에 담겨있는 품목 지불금액
            for (Item item : CartController.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());
            }

            // 총 지불해야할 금액 TEST=============
            System.out.println(customer.getChargeAmount() + "   " + customer.getPayment());
            // 총 지불해야할 금액=============
            if (customer.getChargeAmount() >= customer.getPayment()) {

                List<Item> cartList = CartController.getCartList();


                //결제하기 구입목록창
                System.out.println("\n\n ┌────────────────── 구입목록창 ──────────────────┓  ");
                System.out.println(" │        상품명            단가         수량   │");
                System.out.println("\n   │ ---------------------------------------------│");
                //구매목록=> (상품명 / 단가/ 수량)
                cartList.stream().forEach((Item n) -> System.out.println(n.getItemName() + "                         "
                        + n.getPrice() + "          " + (10 - n.getNum())));

                System.out.println("\n   │------------------------------------------- - │");


                System.out.println(" │\t\t\t  [ 총 결제금액 : " + customer.getPayment() + " ] \t\t\t  │");
                System.out.println(" └─────────────────────────────────────────────────┘  ");


                // 품목명 리스트 담기 TEST -------------------------------------------------------------------------------
                cartList.stream().forEach((Item m) -> Customer.getItemNames().add(m.getItemName()));
                System.out.println("cartList 확인 : "+cartList);
                System.out.println("String 리스트 고객품목 : " + Customer.getItemNames());
                // -------------------------------------------------------------------------------


                cartList = null;
                Customer.setItemNames(null);


                System.out.println("감사합니다! 또 이용해주세요.");
                stop();
                StoreMain.start();
            } else {
                System.out.println("충전 금액이 부족합니다. 충전금액 범위의 품목을 선택하세요.");
                stop();
                StoreMain.selectCustomerMenu();
            }


//            CustomerController.setCustomerLogList();


            //cartList에  아무것도 담겨있지 않은 경우 -> 상품선택창으로 이동

        } else {
            System.out.println("상품을 선택해주세요");
            stop();
            StoreMain.selectCustomerMenu();
        }

    }


}