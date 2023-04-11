package view;

import item.Drink;
import item.Item;
import item.ItemController;
import utility.Utility;

import static utility.Utility.*;

public class ItemViewer {

    private static ItemController ic;
//    private Drink drinkList;


    public static void showItems() {
        System.out.println(" ======= 상품 선택 ========");
        System.out.println(" 1.과자류   2.음료수   3.컵라면   4.주류   5.담배");

        String menuNum = input(" >> ");
        switch (menuNum) {
            case "1":
                break;
            case "2":
                ItemController.showDrink();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;
        }



    }
}
