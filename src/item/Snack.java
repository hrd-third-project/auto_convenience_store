package item;

import customer.Cart;

import java.util.ArrayList;
import java.util.List;

public class Snack extends Item {

    private static List<Snack> snackList =new ArrayList<>();

//    static{
//       snackList.add(new Snack("홈런볼", 1200, 10));
//       snackList.add(new Snack("꼬칼콘", 1200, 10));
//       snackList.add(new Snack("양파링", 1200, 10));
//       snackList.add(new Snack("오레오", 1200, 10));
//       snackList.add(new Snack("포카칩", 1200, 10));
//   }

    public static List<Snack> getSnackList() {
        return snackList;
    }
    public Snack() {
    }


    public Snack(String itemName, int price, int num) {
        super(itemName, price, num);
    }



}
