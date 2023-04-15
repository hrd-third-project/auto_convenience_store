package manage;

import customer.Customer;
import customer.CustomerController;

import java.util.List;

public class PurchaseLog {

    private Customer customer;
    private CustomerController cc;
    private int totalIncome = 0;

    private static List<Customer> customerFinalList;


    public void showPurchaseLog() { // 고객 구매로그 보여주는 메서드
        System.out.println("====================================== < 고객 구매 로그  > ======================================");
        System.out.println("    이름     ┃     나이    ┃       연락처     ┃     충전잔액     ┃     지불금액     ┃    구매품목");
        System.out.println("===============================================================================================");
        if(customerFinalList != null)
        customerFinalList.stream().forEach(n -> System.out.println("   " + n.getName() + "    ┃      " + n.getAge() + "     ┃    " + n.getPhoneNumber() + "   ┃     " + n.getChargeAmount() + "     ┃       " + n.getPayment() + "      ┃ " + n.getItemNames()));
        System.out.println("===============================================================================================");
        // 총 판매수입 계산 => 지불금액 전부 더하기
        if(customerFinalList != null)
        customerFinalList.stream().forEach(n -> totalIncome += n.getPayment());
        // 총 판매수입 계산 => 지불금액 전부 더하기
        System.out.println("[ 중앙 무인 편의점 판매수입 ] : " + totalIncome +" 원");
        System.out.println("===============================================================================================");
        System.out.println();
    }

    public void setCustomerFinalList(List<Customer> customerList) {
        this.customerFinalList = customerList;
    }

    private List<Customer> getCustomerFinalList() {
        return customerFinalList;
    }
}
