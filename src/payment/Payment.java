package payment;

import customer.CartController;
import customer.Customer;
import item.Item;
import view.StoreMain;

import static utility.Utility.stop;

public class Payment {
    //필드
    private static Customer customer;
    private static int payment; //총금액
    private static String purchaseList = "[ "; // 구매리스트

    public static void payCheck() {
        customer = new Customer();
        //선택한 품목이 1개이상인가
        if (CartController.getCartList().size() >= 1) {

            // cartList에 담겨있는 품목 +총금액

            for (Item item : CartController.getCartList()) {
                customer.setPayment(customer.getPayment() + item.getPrice());
                purchaseList += item.getItemName()+" ";
            }
            purchaseList += "]";

            //cartList에 담겨있는 총금액 계산 --> 결제완료 후 처음화면으로 이동
            System.out.println("[총금액] : " + customer.getPayment());
            System.out.println("[구매목록] : " +purchaseList);
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