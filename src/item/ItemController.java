package item;

import customer.Cart;
import customer.Customer;
import customer.CartController;
import utility.Utility;


import java.util.ArrayList;
import java.util.List;

import static utility.Utility.*;

public class ItemController {

    private Snack snack;
    private Drink drink;
    private CupNoodle noodle;
    private Liquor liquor;
    private Smoke smoke;
    private CartController cc;

    public ItemController() {
        cc = new CartController();
    }

    // 간식 리스트 불러오기 및 상품 선택창
    public void showSnack() {
        snack = new Snack();
        List<Snack> snackList = snack.getSnackList();
        checkPoint:
        while (true) {
            System.out.println("\n────────────────────────────────────────");
            System.out.println("│\t\t제품명\t\t금액\t\t재고수량\t\t│");
            System.out.println("────────────────────────────────────────");
            for (Snack snack : snackList) {
                System.out.print("│\t\t");
                System.out.println(snack + "│");
            }
            System.out.println("──────────────────────────────────────");

            System.out.println(" * 담을 품목 이름을 입력하세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String inputItem = input("  >> ");
            if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
                for (Snack snack : snackList) {

                    if (inputItem.equals(snack.getItemName())) {
                        if (snack.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                            cc.getCartList().add(snack);    // 장바구니에 해당 상품 1 추가
                            System.out.println(snack.getItemName() + "을 장바구니에 담았습니다.");
                            snack.setNum(snack.getNum() - 1);   // 해당 상품 재고에서 1 차감
                            stop();
                            break checkPoint;
                        } else {
                            System.out.println(snack.getItemName() + "은 품절입니다.");
                            break checkPoint;
                        }
                    }
                }
                System.out.println("입력하신 상품은 존재하지 않는 상품입니다.");
                stop();
            } else {
                break checkPoint;
            }
        }
    }


    // 음료 리스트 불러오기 및 상품 선택창
    public void showDrink() {
        drink = new Drink();
        List<Drink> drinkList = drink.getDrinkList();

        checkPoint:
        while (true) {

            System.out.println("\n────────────────────────────────────────");
            System.out.println("│\t\t제품명\t\t금액\t\t재고수량\t\t│");
            System.out.println("────────────────────────────────────────");
            for (Drink drink : drinkList) {
                System.out.print("│\t\t");
                System.out.println(drink + "│");  // 음료수 세부품목 리스트 출력
            }
            System.out.println("──────────────────────────────────────");
            System.out.println(" * 담을 품목 이름을 입력하세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String inputItem = input("  >> ");


            if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
                for (Drink drink : drinkList) {

                    if (inputItem.equals(drink.getItemName())) {
                        if (drink.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                            cc.getCartList().add(drink);    // 장바구니에 해당 상품 1 추가
                            System.out.println(drink.getItemName() + "을 장바구니에 담았습니다.");
                            drink.setNum(drink.getNum() - 1);   // 해당 상품 재고에서 1 차감
                            stop();
                            break checkPoint;
                        } else {
                            System.out.println(drink.getItemName() + "은 품절입니다.");
                            break checkPoint;
                        }
                    }
                }
                System.out.println("입력하신 상품은 존재하지 않는 상품입니다.");
                stop();
            } else {
                break checkPoint;
            }
        }

    }

    // 컵라면 리스트 불러오기 및 상품 선택창
    public void showCupNoodle() {
        noodle = new CupNoodle();
        List<CupNoodle> cupNoodle = noodle.getCupNoodleList();

        checkPoint:
        while (true) {

            System.out.println("\n────────────────────────────────────────");
            System.out.println("│\t\t제품명\t\t금액\t\t재고수량\t\t│");
            System.out.println("────────────────────────────────────────");
            for (CupNoodle noodle : cupNoodle) {
                System.out.print("│\t\t");
                System.out.println(noodle + "│");
            }
            System.out.println("──────────────────────────────────────");
            System.out.println(" * 담을 품목 이름을 입력하세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String inputItem = input("  >> ");


            if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
                for (CupNoodle noodle : cupNoodle) {

                    if (inputItem.equals(noodle.getItemName())) {
                        if (noodle.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                            cc.getCartList().add(noodle);    // 장바구니에 해당 상품 1 추가
                            System.out.println(noodle.getItemName() + "을 장바구니에 담았습니다.");
                            noodle.setNum(noodle.getNum() - 1);   // 해당 상품 재고에서 1 차감
                            stop();
                            break checkPoint;
                        } else {
                            System.out.println(noodle.getItemName() + "은 품절입니다.");
                            break checkPoint;
                        }
                    }
                }
                System.out.println("입력하신 상품은 존재하지 않는 상품입니다.");
                stop();
            } else {
                break checkPoint;
            }
        }


    }


    // 주류 리스트 불러오기 및 상품 선택창
    public void showLiquor() {
        liquor = new Liquor();
        List<Liquor> liquorList = liquor.getLiquorList();

        checkPoint:
        while (true) {


            System.out.println("\n────────────────────────────────────────");
            System.out.println("│\t\t제품명\t\t금액\t\t재고수량\t\t│");
            System.out.println("────────────────────────────────────────");
            for (Liquor liquor : liquorList) {
                System.out.print("│\t\t");
                System.out.println(liquor + "│");
            }
            System.out.println("──────────────────────────────────────");
            System.out.println(" * 담을 품목 이름을 입력하세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String inputItem = input("  >> ");

            if (!inputItem.equals("0")) { // 뒤로가기 버튼(0) 을 누르지 않았으면 실행
                for (Liquor liquor : liquorList) {
                    if (inputItem.equals(liquor.getItemName())) {
                        if (liquor.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                            cc.getCartList().add(liquor);    // 장바구니에 해당 상품 1 추가
                            System.out.println(liquor.getItemName() + "을 장바구니에 담았습니다.");
                            liquor.setNum(liquor.getNum() - 1);   // 해당 상품 재고에서 1 차감
                            stop();
                            break checkPoint;
                        } else {
                            System.out.println(liquor.getItemName() + "은 품절입니다.");
                            break checkPoint;
                        }
                    }
                }
                System.out.println("입력하신 상품은 존재하지 않는 상품입니다.");
                stop();
            } else {
                break checkPoint;
            }
        }
    }

    // 담배 리스트 불러오기 및 상품 선택창
    public void showSmoke() {
        smoke = new Smoke();
        List<Smoke> smokeList = smoke.getSmokeList();

        checkPoint:
        while (true) {

            System.out.println("\n────────────────────────────────────────");
            System.out.println("│\t\t제품명\t\t금액\t\t재고수량\t\t│");
            System.out.println("────────────────────────────────────────");
            for (Smoke smoke : smokeList) {
                System.out.print("│\t\t");
                System.out.println(smoke + "│");
            }
            System.out.println("──────────────────────────────────────");
            System.out.println(" * 담을 품목 이름을 입력하세요.");
            System.out.println(" * 뒤로가시려면 '0'을 눌러주세요.");
            String inputItem = input("  >> ");

            if (!inputItem.equals("0")) {   // 뒤로가기 버튼(0) 을 누르지 않았으면 실행

                for (Smoke smoke : smokeList) {
                    if (inputItem.equals(smoke.getItemName())) { // 입력 받은 상품이 존재하는지 확인
                        if (smoke.getNum() > 0) {    // 해당 상품의 개수가 0이 아닌지 확인
                            cc.getCartList().add(smoke);    // 장바구니에 해당 상품 1 추가
                            System.out.println(smoke.getItemName() + "을 장바구니에 담았습니다.");
                            smoke.setNum(smoke.getNum() - 1);   // 해당 상품 재고에서 1 차감
                            stop();
                            break checkPoint;
                        } else {
                            System.out.println(smoke.getItemName() + "은 품절입니다.");
                            break checkPoint;
                        }
                    }
                }
                System.out.println("입력하신 상품은 존재하지 않는 상품입니다.");
                stop();
            } else {
                break checkPoint;
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



