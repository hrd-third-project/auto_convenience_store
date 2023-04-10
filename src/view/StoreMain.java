package view;

import Customer.Customer;
import Utility.Utility;
import Customer.CustomerRepository;

import static Utility.Utility.*;

public class StoreMain {

    // 필드 =============================
    private CustomerRepository repository;


    public StoreMain() {
        repository = new CustomerRepository();
    }

    // 메서드 =============================
    public void start() {

        System.out.println("\n\n 무인 편의점에 오신 것을 환영합니다!");

        selectWho(); // 고객 / 관리자 입장
        customerScreen(); // 고객 화면
        selectCustomerMenu(); // 고객 메뉴 선택


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
//                    managerMenu();
                break;
            default:
                System.out.println("메뉴 번호를 다시 입력해주세요.");
                break;
        }


    }

    // 고객 정보 입력하기
    private void customerView() {

        System.out.println("\n영합니다!");
        System.out.println("회원님의 신분증 정보를 입력해주세요!");
        String name = input(" - 이      름: ");
        int birth = Integer.parseInt(input(" - 생년월일(6자리): "));
        System.out.println(" - 연락처는 - 없이 정확히 입력해주세요!");
        int phoneNumber = Integer.parseInt(input("    >> "));

//        System.out.println(" 회원님의 보유 금액....");


        Customer customer = new Customer();
        customer.setName(name);
        customer.setBirth(birth);
        customer.setPhoneNumber(phoneNumber);

        repository.register(customer);
    }


    // 고객 메뉴
    private void customerScreen() {
        System.out.println(" # 1. 마이페이지");
        System.out.println(" # 2. 장바구니 목록 조회하기");
        System.out.println(" # 1. 마이페이지");
        System.out.println(" # 1. 마이페이지");
        System.out.println(" # 1. 마이페이지");
    }


    private void selectCustomerMenu() {
        String menuNum = input(" - 메뉴 번호: ");

        switch (menuNum) {
            case "1":
                // 마이페이지: 가입한 회원정보 출력
                Customer user = repository.findCustomer();
                System.out.println("\n ********* 회원님 정보 ********");
                System.out.println("# 회원명: " + user.getName());
                System.out.println("# 생년월일: " + user.getBirth());
                System.out.println("# 연락처: " + user.getPhoneNumber());
                System.out.println("# 보유금액: " + user.getMoney());
                break;

            case "2":
                ㅇㅇㅇ
                break;

            case "3":
                break;

            case "4":
                break;
            default:
                break;


        }


    }


}
