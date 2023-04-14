package payment;

import customer.CartController;
import customer.Customer;
import customer.CustomerController;
import item.Item;
import manage.PurchaseLog;
import view.StoreMain;

import java.util.List;

import static utility.Utility.stop;

public class Payment {


//    private Customer customer;
    private CustomerController cmcl;
    private  CartController cc;
    private StoreMain sm;
    private PurchaseLog pl;
    private int payment; //총금액

    public Payment() {
        cc = new CartController();
        cmcl = new CustomerController();
    }

    public void payCheck(Customer customer) {
        sm = new StoreMain();
        //선택한 품목이 1개이상인가
        if (cc.getCartList().size() >= 1) {
            // TEST ===================================
            System.out.println(cc.getCartList());
            System.out.println(customer.getItemNames());
            System.out.println(customer.getChargeAmount() + "  " + customer.getAge());
            // TEST ===================================

            // cartList에 담겨있는 품목 지불금액
            for (Item item : cc.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());
            }

            // 총 지불해야할 금액 TEST=============
            System.out.println(customer.getChargeAmount() + "   " + customer.getPayment());
            System.out.println("customer : " + customer);
            // 총 지불해야할 금액 TEST=============
            if (customer.getChargeAmount() >= customer.getPayment()) {

                List<Item> cartList = cc.getCartList();
                List<String> itemNames = customer.getItemNames();


            //결제하기 구입목록창
            System.out.println("\n ┌────────────────── 구입목록창 ─────────────────┓  ");
            System.out.println(" │      상품명            단가         수량       │");
            System.out.println(" │ -------------------------------------------- │");
            //구매목록=> (상품명 / 단가/ 수량)
            cartList.stream().forEach((Item n) -> System.out.println(" │ \t\t"+n.getItemName()+"           "
                                  +n.getPrice()+"          "+(10-n.getNum()+"\t    │")));

            System.out.println(" │ -------------------------------------------- │");
            System.out.println(" │  \t\t\t[ 총 결제금액 : " + customer.getPayment()+ "원 ]\t\t\t│");

            System.out.println(" └──────────────────────────────────────────────┘  ");

                int leftAmount = customer.getChargeAmount() - customer.getPayment();
                // 충전요금 -= 지불액 (충전요금에서 지불액만큼 차감 후 다시 저장)
                customer.setChargeAmount(leftAmount);

                // 품목명 리스트 담기 TEST ----------------------------------------------------------------------- start
                cartList.stream().forEach((Item m) -> customer.getItemNames().add(m.getItemName()));

                System.out.println("cartList 확인 : " + cartList);
                System.out.println("String 리스트 고객품목 : " + customer.getItemNames());
                System.out.println("최종 Customer(비워내기전) : " + customer);
                // -------------------------------------------------------------------------------------------- end


                // 고객 구매로그 리스트에 담기 -------------------------------------------
                cmcl.getCustomerLogList().add(customer);
                cmcl.getCustomerLogList().stream().forEach(n -> System.out.println("고객 구매로그 @@ : "+n));
                // 고객 구매로그 리스트에 담기 -------------------------------------------

                        // 고객 구매로그 리스트 관리인 페이지로 넘기기 ------------------------
                                pl = new PurchaseLog();
                                pl.setCustomerList(cmcl.getCustomerLogList());

                        // 고객 구매로그 리스트 관리인 페이지로 넘기기 ------------------------


                // cartList 비워주기 TEST ======================================
                cc.getCartList().stream().forEach(n -> System.out.println(n));

                    // 카트리스트 비워주기 성공 ===============================
                    cc.getCartList().removeAll(cartList);
                    // 카트리스트 비워주기 성공 ===============================

                System.out.println("결제후 cartList : " + cc.getCartList());
                System.out.println("결제후 ItemNames : " + customer.getItemNames());
                cmcl.getCustomerLogList().stream().forEach(n -> System.out.println("(람다)비워낸 후 고객 구매로그 @@ : "+n));
                System.out.println("비워낸 후 고객 구매로그 @@ : "+cmcl.getCustomerLogList());
                // cartList 비워주기 TEST ======================================
                System.out.println("감사합니다! 또 이용해주세요.");
                stop();
                sm.start();
            } else {
                System.out.println("충전 금액이 부족합니다. 충전금액 범위의 품목을 선택하세요.");
                stop();
                sm.selectCustomerMenu();
            }


//            CustomerController.setCustomerLogList();


            //cartList에  아무것도 담겨있지 않은 경우 -> 상품선택창으로 이동

        } else {
            System.out.println("상품을 선택해주세요");
            stop();
            sm.selectCustomerMenu();
        }

    }


}