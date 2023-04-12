package view;

import customer.Customer;
import item.Drink;
import item.Item;
import item.ItemController;
import utility.Utility;

import static utility.Utility.*;

public class ItemViewer {

    private static ItemController ic;




    public static void showItems(Customer customer) {
        while (true) {
            System.out.println("\n=========== 상품 선택 ============");
            System.out.print("1.과자류     ");
            System.out.print("2.음료수     ");
            System.out.print("3.컵라면     ");
            if (ItemController.isAllow(customer))
                System.out.print("\n4.주류       ");
            if (ItemController.isAllow(customer))
                System.out.print("5.담배   ");


            String menuNum = input("\n >> ");
            switch (menuNum) {
                case "1":
                    ItemController.showSnack();
                    break;
                case "2":
                    ItemController.showDrink();
                    break;
                case "3":
                    ItemController.showCupNoodle();
                    break;
                case "4":
                    if (!ItemController.isAllow(customer))
                        continue;
                    ItemController.showLiquor();
                    break;
                case "5":
                    if (!ItemController.isAllow(customer))
                        continue;
                    ItemController.showSmoke();
                    break;
                default:
                    break;
            }

        }

    }
}
