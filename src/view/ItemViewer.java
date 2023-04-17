package view;

import customer.Customer;
import item.Drink;
import item.Item;
import item.ItemController;
import utility.Utility;

import static utility.Utility.*;

public class ItemViewer {

    private ItemController ic;

    public ItemViewer() {
        ic = new ItemController();
    }

    public void showItems(Customer customer) {
        while (true) {
            System.out.println("\n=========== 상품 선택 ============");
            System.out.print("1.과자류     ");
            System.out.print("2.음료수     ");
            System.out.print("3.컵라면     ");
            if (ItemController.isAllow(customer))
                System.out.print("\n4.주류       ");
            if (ItemController.isAllow(customer))
                System.out.print("5.담배   ");
            System.out.println("\n  * 뒤로가시려면 '0'을 눌러주세요.");


            String menuNum = input(">> ");
            switch (menuNum) {
                case "1":
                    ic.showSnack();
                    break;
                case "2":
                    ic.showDrink();
                    break;
                case "3":
                    ic.showCupNoodle();
                    break;
                case "4":
                    if (!ItemController.isAllow(customer))
                        continue;
                    ic.showLiquor();
                    break;
                case "5":
                    if (!ItemController.isAllow(customer))
                        continue;
                    ic.showSmoke();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("번호의 입력이 잘못되었습니다");
                    stop();
                    break;
            }

        }

    }
}
