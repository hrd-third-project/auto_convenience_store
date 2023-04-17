package view;

import customer.CartController;
import customer.Customer;
import customer.CustomerController;
import manage.ManagerViewer;
import payment.Payment;
import utility.Utility;

import static utility.Utility.*;
import static view.CartViewer.*;

public class StoreMain {

    // 필드 =============================

    private ManagerViewer mv;
    private Customer customer;
    private CartController cc;
    private ItemViewer iv;
    private CartViewer cv;
    private Payment p;


    public StoreMain() {
        customer = new Customer();
        mv = new ManagerViewer();
        cc = new CartController();
        iv = new ItemViewer();
        cv = new CartViewer();
        p = new Payment();
    }

    // 메서드 =============================
    public void start() {

        System.out.println("\n  ★ 중앙 무인 편의점에 오신것을 환영합니다! ★");
        selectWho(); // 고객 / 관리자 입장
    }


    // 고객 / 관리자 입장
    private void selectWho() {

        while (true) {
        System.out.println(" 1. 고객으로 입장하기 / 2. 관리자로 입장하기");
        String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    customerView();
                    break;
                case "2":
                    mv.managerLogin();
                    break;
                default:
                    System.out.println("메뉴 번호를 다시 입력해주세요.");
                    break;
            }
        }

    }


    // 고객 정보 입력하기
    private Customer customerView() {
        customer = new Customer();
        System.out.println("\n  ★ 중앙 무인 편의점에 오신것을 환영합니다! ★");
        System.out.println("        회원님의 정보를 입력해주세요!       ");
        System.out.println(" ────────────────────────────────────────");
        customer.setName(input(" ┃ - 이    름: "));
        customer.setAge(Integer.parseInt(input(" ┃ - 나    이: ")));
        customer.setPhoneNumber(input(" ┃ - 연 락 처: "));
        System.out.println(" ┃    * 최소 충전 금액은 3,000원 입니다 ^0^");
        customer.setChargeAmount(Integer.parseInt(input(" ┃ - 충전금액: ")));
        System.out.println(" ──────────────────────────────────────────");


        CustomerController customerctrl = new CustomerController();

        if (customerctrl.isExist(customer.getAge(), customer.getChargeAmount())) {
            selectCustomerMenu(); // 고객 메뉴 선택
        }else {
            System.out.println("         고객 정보를 정확히 입력해주세요!");
        }

        Utility.stop();

        return customer;
    }


    public void selectCustomerMenu() { // 고객 메뉴 선택 메서드

        while (true) {
            System.out.println("\n ┌──── ★무인편의점★ ────┐ ");
            System.out.println(" │  # 1. 상품선택         │");
            System.out.println(" │  # 2. 장바구니         │");
            System.out.println(" │  # 3. 결제하기         │ ");
            System.out.println(" └───────────────────────┘");
            String menuNum = input(" - 메뉴 번호: ");

            switch (menuNum) {
                case "1":
                    iv.showItems(customer); // 1. 상품선택
                    break;

                case "2":
                    cv.myCart(); // 2. 장바구니
                    break;

                case "3":
                    p.payCheck(customer);
                    // 3. 결제하기
                    break;
                default:
                    break;


            }
        }


    }



}
