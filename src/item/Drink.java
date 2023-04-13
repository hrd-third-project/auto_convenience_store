package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink extends Item {
    private static List<Drink> drinkList;


    private  static sdasda;;
    static {

        drinkList = new ArrayList<>(Arrays.asList(
        new Drink("코카콜라", 2000, 10),
        new Drink("사이다", 1800, 10),
        new Drink("토레타", 1400, 10),
        new Drink("마운틴듀", 1500, 10),
        new Drink("밀키스", 1200, 10)
        ));
    }

    public Drink(String itemName,int price, int num){
    super(itemName, price, num);
    }


    public static List<Drink> getDrinkList() {
        return drinkList;
    }
}

