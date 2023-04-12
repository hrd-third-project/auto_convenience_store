package item;

import customer.Cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snack extends Item {

    private static List<Snack> snackList;

    static{
        snackList = new ArrayList<>(Arrays.asList(
       new Snack("홈런볼", 1200, 10),
       new Snack("꼬칼콘", 1200, 10),
       new Snack("양파링", 1200, 10),
       new Snack("오레오", 1200, 10),
       new Snack("포카칩", 1200, 10)
        ));
   }

    public static List<Snack> getSnackList() {
        return snackList;
    }
    public Snack() {
    }


    public Snack(String itemName, int price, int num) {
        super(itemName, price, num);
    }



}
