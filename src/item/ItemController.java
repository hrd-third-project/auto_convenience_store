package item;

import customer.Cart;
import customer.Customer;
import customer.CartController;
import utility.Utility;


import java.util.ArrayList;
import java.util.List;

import static utility.Utility.*;

public class ItemController {


//    private CartController cc;


    // 간식 리스트 불러오기 및 상품 선택창
    public static void showSnack() {
        List<Snack> snackList = Snack.getSnackList();
        for (Snack snack : snackList) {
            System.out.println(snack);
        }

        System.out.println("담을 품목 이름을 입력하세요.");
        System.out.println("뒤로가시려면 '0'을 눌러주세요.");
        String inputItem = input(">> ");
        if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
            for (Snack snack : snackList) {

                if (inputItem.equals(snack.getItemName())) {
                    if(snack.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                        CartController.getCartList().add(snack);    // 장바구니에 해당 상품 1 추가
                        System.out.println(snack.getItemName() + "을 장바구니에 담았습니다.");
                        snack.setNum(snack.getNum() - 1);   // 해당 상품 재고에서 1 차감
                    } else {
                        System.out.println(snack.getItemName() + "은 품절입니다.");
                    }
                }
            }
        }

    }

    // 음료 리스트 불러오기 및 상품 선택창
    public static void showDrink() {
        List<Drink> drinkList = Drink.getDrinkList();
        for (Drink drink : drinkList) {
            System.out.println(drink);
        }

        System.out.println("담을 품목 이름을 입력하세요.");
        System.out.println("뒤로가시려면 '0'을 눌러주세요.");
        String inputItem = input(">> ");
        if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
            for (Drink drink : drinkList) {

                if (inputItem.equals(drink.getItemName())) {
                    if(drink.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                        CartController.getCartList().add(drink);    // 장바구니에 해당 상품 1 추가
                        System.out.println(drink.getItemName() + "을 장바구니에 담았습니다.");
                        drink.setNum(drink.getNum() - 1);   // 해당 상품 재고에서 1 차감
                    } else {
                        System.out.println(drink.getItemName() + "은 품절입니다.");
                    }
                }
            }
        }


    }

    // 컵라면 리스트 불러오기 및 상품 선택창
    public static void showCupNoodle() {
        List<CupNoodle> cupNoodle = CupNoodle.getCupNoodleList();
        for (CupNoodle noodle : cupNoodle) {
            System.out.println(noodle);
        }
        System.out.println("담을 품목 이름을 입력하세요.");
        System.out.println("뒤로가시려면 '0'을 눌러주세요.");
        String inputItem = input(">> ");
        if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
            for (CupNoodle noodle : cupNoodle) {

                if (inputItem.equals(noodle.getItemName())) {
                    if(noodle.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                        CartController.getCartList().add(noodle);    // 장바구니에 해당 상품 1 추가
                        System.out.println(noodle.getItemName() + "을 장바구니에 담았습니다.");
                        noodle.setNum(noodle.getNum() - 1);   // 해당 상품 재고에서 1 차감
                    } else {
                        System.out.println(noodle.getItemName() + "은 품절입니다.");
                    }
                }
            }
        }

    }


    // 주류 리스트 불러오기 및 상품 선택창
    public static void showLiquor() {
        List<Liquor> liquorList = Liquor.getLiquorList();
        for (Liquor liquor : liquorList) {
            System.out.println(liquor);
        }

        System.out.println("담을 품목 이름을 입력하세요.");
        System.out.println("뒤로가시려면 '0'을 눌러주세요.");
        String inputItem = input(">> ");
        if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
            for (Liquor liquor : liquorList) {

                if (inputItem.equals(liquor.getItemName())) {
                    if(liquor.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                        CartController.getCartList().add(liquor);    // 장바구니에 해당 상품 1 추가
                        System.out.println(liquor.getItemName() + "을 장바구니에 담았습니다.");
                        liquor.setNum(liquor.getNum() - 1);   // 해당 상품 재고에서 1 차감
                    } else {
                        System.out.println(liquor.getItemName() + "은 품절입니다.");
                    }
                }
            }
        }


    }

    // 담배 리스트 불러오기 및 상품 선택창
    public static void showSmoke() {
        List<Smoke> smokeList = Smoke.getSmokeList();
        for (Smoke smoke : smokeList) {
            System.out.println(smoke);
        }

        System.out.println("담을 품목 이름을 입력하세요.");
        System.out.println("뒤로가시려면 '0'을 눌러주세요.");
        String inputItem = input(">> ");
        if (!inputItem.equals("0")) {   // 뒤로가기 버튼(0) 을 누르지 않았으면 실행

            for (Smoke smoke : smokeList) {
                if (inputItem.equals(smoke.getItemName())) { // 입력 받은 상품이 존재하는지 확인
                    if(smoke.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                        CartController.getCartList().add(smoke);    // 장바구니에 해당 상품 1 추가
                        System.out.println(smoke.getItemName() + "을 장바구니에 담았습니다.");
                        smoke.setNum(smoke.getNum() - 1);   // 해당 상품 재고에서 1 차감
                    } else {
                        System.out.println(smoke.getItemName() + "은 품절입니다.");
                    }
                }
            }


        }

    }

    /**
     * 고객의 나이를 검증하는 메서드
     *
     * @return 고객나이가 19세 이상이면 true
     */
    public static boolean isAllow(Customer customer) {
        return customer.getAge() >= 19;
    }


}



