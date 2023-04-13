package payment;

import customer.Cart;
import customer.CartController;
import item.Item;
import utility.Utility;
import view.StoreMain;

import static utility.Utility.stop;

public class Payment {
    //필드
    private int payment;// 지불금액


    private static int paymentPrice; //총금액
    private static String purchaseList = ""; // 구매리스트

    public static void payCheck() {
        //선택한 품목이 1개이상인가
        if (CartController.getCartList().size() >= 1) {

            //Mycart 리스트에 담겨있는 품목 +총금액

            for (Item item : CartController.getCartList()) {
                paymentPrice += item.getPrice();
                purchaseList += item.getItemName();
            }

            //Mycart 리스테 담겨있는 총금액 계산 --> 결제완료 후 처음화면으로 이동
            System.out.println("[총금액] : " + paymentPrice);
            System.out.println("[구매목록] : " +purchaseList);
            System.out.println("감사합니다! 또 이용해주세요.");
            stop();
            StoreMain.start();

            //NO 면 상품선택창으로 이동
        } else {
            System.out.println("상품을 선택해주세요");
            stop();
            StoreMain.selectCustomerMenu();
        }

    }


}