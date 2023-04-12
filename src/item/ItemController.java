package item;

import customer.Cart;
import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class ItemController {




    // 스낵리스트 불러오기
    public static void showSnack() {
        List<Snack> snackList = Snack.getSnackList();
        for (Snack snack : snackList) {
            System.out.println(snack);
        }
    }

    public static void showDrink() {
        List<Drink> drinkList = Drink.getDrinkList();
        for (Drink drink : drinkList) {
            System.out.println(drink);
        }
    }

    public static void showCupNoodle() {
        List<CupNoodle> cupNoodle = CupNoodle.getCupNoodleList();
        for (CupNoodle noodle : cupNoodle) {
            System.out.println(noodle);
        }
    }

    public static void showLiquor() {
        List<Liquor> liquorList = Liquor.getLiquorList();
        for (Liquor liquor : liquorList) {
            System.out.println(liquor);
        }
    }

    public static void showSmoke() {
        List<Smoke> smokeList = Smoke.getSmokeList();
        for (Smoke smoke : smokeList) {
            System.out.println(smoke);
        }
    }

    /**
     * 고객의 나이를 검증하는 메서드
     * @return 고객나이가 19세 이상이면 true
     */
    public static boolean isAllow(Customer customer) {

        return customer.getAge() >= 19;
    }


}
