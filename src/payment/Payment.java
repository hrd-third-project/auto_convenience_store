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
        customer = new Customer();
        //선택한 품목이 1개이상인가
        if (CartController.getCartList().size() >= 1) {

            // cartList에 담겨있는 품목 지불금액
            for (Item item : CartController.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());
            }

            // 총 지불해야할 금액 TEST=============
            System.out.println(customer.getChargeAmount() + "   " + customer.getPayment());
            System.out.println("customer : " + customer);
            // 총 지불해야할 금액 TEST=============
            if (customer.getChargeAmount() >= customer.getPayment()) {

                List<Item> cartList = CartController.getCartList();
                List<String> itemNames = Customer.getItemNames();

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


                // 품목명 리스트 담기 TEST ----------------------------------------------------------------------- start
                cartList.stream().forEach((Item m) -> Customer.getItemNames().add(m.getItemName()));
                System.out.println("cartList 확인 : " + cartList);
                System.out.println("String 리스트 고객품목 : " + Customer.getItemNames());
                System.out.println("최종 Customer(비워내기전) : " + customer);
                // -------------------------------------------------------------------------------------------- end

                // 고객 구매로그 리스트에 담기 -------------------------------------------
                CustomerController.getCustomerLogList().add(customer);
                CustomerController.getCustomerLogList().stream().forEach(n -> System.out.println("고객 구매로그 @@ : "+n));
                // 고객 구매로그 리스트에 담기 -------------------------------------------


                // cartList & 품목리스트 비워주기 TEST ======================================
                CartController.getCartList().stream().forEach(n -> System.out.println(n));

                    // 카트리스트 & 품목이름리스트 비워주기 성공 ===============================
                    CartController.getCartList().removeAll(cartList);
                    Customer.getItemNames().removeAll(itemNames);
                    // 카트리스트 & 품목이름리스트 비워주기 성공 ===============================

                System.out.println("결제후 cartList : " + CartController.getCartList());
                System.out.println("결제후 ItemNames : " + Customer.getItemNames());
                CustomerController.getCustomerLogList().stream().forEach(n -> System.out.println("(람다)비워낸 후 고객 구매로그 @@ : "+n));
                System.out.println("비워낸 후 고객 구매로그 @@ : "+CustomerController.getCustomerLogList());
                // cartList & 품목리스트 비워주기 TEST ======================================

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