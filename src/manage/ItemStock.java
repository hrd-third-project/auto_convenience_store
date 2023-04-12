package manage;

import item.Snack;

import java.util.List;

import static utility.Utility.*;

public class ItemStock {

    public ItemStock() {

    }

    public void showItemMenu() {    // 편의점 재고 품목을 보여주는 메서드
        System.out.println("[ 편의점 재고 품목 ]");
        System.out.println("1.과자  2.음료수  3.라면  4.주류  5.담배");
        String num = input(">> ");

        switch (num) {
            case "1":
                System.out.println(Snack.getSnackList());
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
                System.out.println("잘못된 번호 입력입니다.");
                break;
        }


    }

}
