package manage;

import item.*;
import utility.Utility;

import java.util.List;

import static utility.Utility.*;

public class ItemStock {

    private Snack snack;
    private Drink drink;
    private CupNoodle noodle;
    private Liquor liquor;
    private  Smoke smoke;

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
                    snack = new Snack();
                    snack.getSnackList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "2":
                    drink = new Drink();
                    drink.getDrinkList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "3":
                    noodle = new CupNoodle();
                    noodle.getCupNoodleList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "4":
                    liquor = new Liquor();
                    liquor.getLiquorList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                case "5":
                    smoke = new Smoke();
                    smoke.getSmokeList().stream().forEach((Item n) -> System.out.println(" │\t\t\t" + n.getItemName() + "\t\t\t\t" + n.getNum() + "\t\t\t│ "));
                    break;
                default:
                    System.out.println(" \t\t\t잘못된 번호 입력입니다.");
                    break;
            }
            System.out.println(" │ ======================================== │");
            System.out.println(" └──────────────────────────────────────────┘  ");

            stop();
        }

    }

}
