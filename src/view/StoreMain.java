package view;

import customer.Customer;
import manage.ManagerViewer;

import static utility.Utility.*;
import static view.CartViewer.*;
import static view.ItemViewer.*;

public class StoreMain {

    // 필드 =============================

    private ManagerViewer mv;
    private Customer customer;

    public StoreMain() {

        mv = new ManagerViewer();
    }

    // 메서드 =============================
    public void start() {

        System.out.println("\n\n 무인 편의점에 오신 것을 환영합니다!");

            selectWho(); // 고객 / 관리자 입장

    }


    // 고객 / 관리자 입장
    private void selectWho() {

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


    // 고객 정보 입력하기
    private void customerView() {
        customer = new Customer();
        System.out.println("\n환영합니다!");
        System.out.println("회원님의 정보를 입력해주세요!");
        customer.setName(input(" - 이      름: "));
        customer.setAge(Integer.parseInt(input(" - 나      이: ")));
        customer.setPhoneNumber(input(" - 연락처: "));
        customer.setMoney(Integer.parseInt(input("- 충전할 금액: ")));

        selectCustomerMenu(); // 고객 메뉴 선택
    }


    private void selectCustomerMenu() { // 고객 메뉴 선택 메서드

        System.out.println(" # 1. 상품선택");
        System.out.println(" # 2. 장바구니");
        System.out.println(" # 3. 결제하기");

        String menuNum = input(" - 메뉴 번호: ");

        switch (menuNum) {
            case "1":
                showItems(); // 1. 상품선택
                break;

            case "2":
                myCart(); // 2. 장바구니
                break;

            case "3":
                // 3. 결제하기
                break;

            default:
                break;


        }


    }


}
