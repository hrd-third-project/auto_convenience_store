package item;

import customer.Cart;

import java.util.ArrayList;
import java.util.List;

public class ItemController {

   public Drink drinkList;


    public static void showSnacks(/*List<Drink> drinkList*/) {

        for (Drink drink : Drink.getDrinkList()) {
            System.out.println("drink = " + drink);
        }
        



    }

}
