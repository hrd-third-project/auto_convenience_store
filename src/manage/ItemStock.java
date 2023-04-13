package manage;

import item.*;
import utility.Utility;

import java.util.List;

import static utility.Utility.*;

public class ItemStock {

    public ItemStock() {

    }

    public void showItemMenu() {    // 편의점 재고 품목을 보여주는 메서드

        showItems:while (true) {
            System.out.println("[ 편의점 재고 품목 ]");
            System.out.println("0. 뒤로가기 1.과자  2.음료수  3.라면  4.주류  5.담배");
            String num = input(">> ");

            if(num.equals("0")) break showItems;

            System.out.println("\n\n ┌───────────── 편의점 재고 창고 ─────────────┓  ");
            System.out.print(" │         상품명               수 량        │ ");
            System.out.println("\n │ ======================================== │");

            switch (num) {
                case "1":
                    Snack.getSnackList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "2":
                    Drink.getDrinkList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "3":
                    CupNoodle.getCupNoodleList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "4":
                    Liquor.getLiquorList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "5":
                    Smoke.getSmokeList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                default:
                    System.out.println("잘못된 번호 입력입니다.");
                    break;
            }
            System.out.println(" │ ======================================== │");
            System.out.println(" └──────────────────────────────────────────┘  ");

            stop();
        }

    }

}
