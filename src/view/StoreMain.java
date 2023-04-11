package view;

import customer.Customer;
import customer.CustomerRepository;
import manage.ManagerViewer;

import static utility.Utility.*;
import static view.CartViewer.*;

public class StoreMain {

    // 필드 =============================
    private CustomerRepository cr;
    private ManagerViewer mv;

    public StoreMain() {
        cr = new CustomerRepository();
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
                customerScreen(); // 고객 정보 입력화면
                selectCustomerMenu(); // 고객 메뉴 선택
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

        System.out.println("\n환영합니다!");
        System.out.println("회원님의 신분증 정보를 입력해주세요!");
        String name = input(" - 이      름: ");
        int age = Integer.parseInt(input(" - 나      이: "));
        System.out.println(" - 연락처는 - 없이 정확히 입력해주세요!");
        int phoneNumber = Integer.parseInt(input("    >> "));

//        System.out.println(" 회원님의 보유 금액....");


        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(age);
        customer.setPhoneNumber(phoneNumber);

        cr.register(customer);
    }


    // 고객 메뉴
    private void customerScreen() {
        System.out.println(" # 1. 상품선택");
        System.out.println(" # 2. 장바구니");
        System.out.println(" # 3. 결제하기");
    }


    private void selectCustomerMenu() {
        String menuNum = input(" - 메뉴 번호: ");

        switch (menuNum) {
            case "1":

                break;

            case "2":
                myCart();
                break;

            case "3":
                break;

            default:
                break;


        }


    }


}
