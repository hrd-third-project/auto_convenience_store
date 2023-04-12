package item;

import customer.Cart;

import java.util.ArrayList;
import java.util.List;

public class ItemController {

//   public Drink drinkList;


    public static void showDrink() {
        List<Drink> drinkList = Drink.getDrinkList();
        for (Drink drink : drinkList) {
            System.out.println("drink = " + drink);
        }
        


    }

}
