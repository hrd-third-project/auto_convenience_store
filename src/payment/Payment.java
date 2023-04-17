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

    private Customer customer;
    private CustomerController cmcl;
    private CartController cc;
    private StoreMain sm;
    private PurchaseLog pl;
    private int payment; //총금액

    public Payment() {
        cc = new CartController();
        cmcl = new CustomerController();
    }

    public void payCheck(Customer customer) {
        this.customer = customer;
        sm = new StoreMain();
        //선택한 품목이 1개이상인가
        if (cc.getCartList().size() >= 1) {

            // cartList에 담겨있는 품목 지불금액
            for (Item item : cc.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());
            }

            if (customer.getChargeAmount() >= customer.getPayment()) {

                List<Item> cartList = cc.getCartList();
                List<String> itemNames = customer.getItemNames();


                //결제하기 구입목록창
                System.out.println("\n ┌──────────────── 구입목록창 ────────────────┐  ");
                System.out.println(" │      상품명           단가         수량     │");
                System.out.println(" │ ----------------------------------------- │");
                //구매목록 => (상품명 / 단가/ 수량)
                cartList.stream().distinct().forEach((Item n) -> System.out.println(" │ \t\t" + n.getItemName() + "           "
                        + n.getPrice() + "          " + (10 - n.getNum() + "\t\t │")));


                System.out.println(" │ ----------------------------------------- │");
                System.out.println(" │ \t\t\t[ 총 결제금액 : " + customer.getPayment() + "원 ]\t\t\t │");

                System.out.println(" └───────────────────────────────────────────┘  ");

                // 충전요금 -= 지불액 (충전요금에서 지불액만큼 차감 후 다시 저장) ===== start
                int leftAmount = customer.getChargeAmount() - customer.getPayment();
                customer.setChargeAmount(leftAmount);
                // 충전요금 -= 지불액 (충전요금에서 지불액만큼 차감 후 다시 저장) ===== end

                // 구매품목명 리스트에 담기 ----------------------------------- start
                cartList.stream().forEach((Item m) -> customer.getItemNames().add(m.getItemName()));
                // 구매품목명 리스트에 담기 ----------------------------------- end


                // 고객 구매로그 리스트에 담기 ------------------------------------------- start
                cmcl.getCustomerLogList().add(customer);
                // 고객 구매로그 리스트에 담기 ------------------------------------------- end


                // 고객 구매로그 리스트 관리인 페이지로 넘기기 ------------------------ start
                pl = new PurchaseLog();
                pl.setCustomerFinalList(cmcl.getCustomerLogList());
                // 고객 구매로그 리스트 관리인 페이지로 넘기기 ------------------------ end


                // 카트리스트 비워주기 성공 =============================== start
                cc.getCartList().removeAll(cartList);
                // 카트리스트 비워주기 성공 =============================== end

                System.out.println("감사합니다! 또 이용해주세요.");
                stop();
                sm.start();
            } else {
                customer.setPayment(0); // 위쪽에서 setPayment에 넣어둔 처음값부터 계속 중첩으로 값이 쌓이게 되는 것을 되돌려주는 역할
                System.out.println("충전 금액이 부족합니다. 충전금액 범위의 품목을 선택하세요.");
//                sm.selectCustomerMenu();  --> customer 객체를 초기화시켜 NULL로 만듦 // 사용금지 (비용초과로 결제가 막힌 후 장바구니에서 덜어내고 결제를 시도해도 결제가 막히는 버그 수정완료)
            }

            //cartList에  아무것도 담겨있지 않은 경우 -> 상품선택창으로 이동

        } else {
            System.out.println("상품을 선택해주세요");
            stop();
//                sm.selectCustomerMenu();  --> customer 객체를 초기화시켜 NULL로 만듦 // 사용금지 (비용초과로 결제가 막힌 후 장바구니에서 덜어내고 결제를 시도해도 결제가 막히는 버그 수정완료)

        }

    }

}