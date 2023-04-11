package view;

import item.Item;
import item.ItemController;
import utility.Utility;

import static utility.Utility.*;

public class ItemViewer {

    private static ItemController ic;


    public static void showItems() {
        System.out.println(" ======= 상품 선택 ========");
        System.out.println(" 1.과자류   2.음료수   3.컵라면   4.주류   5.담배");

        String menuNum = input(" >> ");
        switch (menuNum) {
            case "1":
                ItemController.showSnacks();

                break;
            case "2":
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
