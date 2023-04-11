package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink extends Item {
    private List<Drink> drinkList;


    public Drink(){

        drinkList = new ArrayList<>(Arrays.asList(
        new Drink("코카콜라", 1500, 10),
        new Drink("사이다", 1500, 10),
        new Drink("환타", 1500, 10),
        new Drink("마운틴듀", 1500, 10),
        new Drink("바나나우유", 1500, 10)
        ));
    }

    public Drink(String itemName,int price, int num){
    super(itemName, price, num);
    }
}

