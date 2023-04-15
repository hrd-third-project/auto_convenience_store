package item;

import customer.Cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snack extends Item {

    private static List<Snack> snackList;

    static {
        snackList = new ArrayList<>(Arrays.asList(
                new Snack("홈런볼", 1600, 10),
                new Snack("꼬칼콘", 1500, 10),
                new Snack("양파링", 1700, 10),
                new Snack("오레오", 2500, 10),
                new Snack("포카칩", 2300, 10)
        ));
    }

    public Snack() {}

    public Snack(String itemName, int price, int num) {
        super(itemName, price, num);
    }


    public List<Snack> getSnackList() {
        return snackList;
    }



}
