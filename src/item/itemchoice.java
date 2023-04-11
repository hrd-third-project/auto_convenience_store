package item;

import java.util.ArrayList;
import java.util.List;

public class itemchoice {

    //필드생성
    private List<Drink> drinkList;

    private List<Snack> snackList;

    private List<Liquor> liquorList;

    private List<CupNoodle> cupNoodleList;

    private List<Smoke> smokeList;


    //생성자 생성
    public itemchoice() {
        this.drinkList = new ArrayList<>();
        this.snackList = new ArrayList<>();
        this.liquorList = new ArrayList<>();
        this.cupNoodleList = new ArrayList<>();
        this.smokeList = new ArrayList<>();
        intialize();
    }
    //초기설정


    private void intialize() {

        this.drinkList.add(new Drink("코카콜라",1500,10));
        this.drinkList.add(new Drink("사이다",1500,10));
        this.drinkList.add(new Drink("환타",1500,1500));
        this.drinkList.add(new Drink("마운틴듀",1500,1500));
        this.drinkList.add(new Drink("바나나우유",1500,1500));

        this.snackList.add(new Snack("홈런볼",1200,10));
        this.snackList.add(new Snack("꼬칼콘",1200,10));
        this.snackList.add(new Snack("양파링",1200,10));
        this.snackList.add(new Snack("오레오",1200,10));
        this.snackList.add(new Snack("포카칩",1200,10));


        this.liquorList.add(new Liquor("참이슬",1800,10));
        this.liquorList.add(new Liquor("처음처럼",1800,10));
        this.liquorList.add(new Liquor("새로",1800,10));
        this.liquorList.add(new Liquor("카스",1800,10));
        this.liquorList.add(new Liquor("진로",1800,10));

        this.cupNoodleList.add(new CupNoodle("신라면",1100,10));
        this.cupNoodleList.add(new CupNoodle("왕뚜껑",1100,10));
        this.cupNoodleList.add(new CupNoodle("튀김우동",1100,10));
        this.cupNoodleList.add(new CupNoodle("참깨라면",1100,10));
        this.cupNoodleList.add(new CupNoodle("너구리",1100,10));


        this.smokeList.add(new Smoke("말보르",4500,10));
        this.smokeList.add(new Smoke("에쎄체인지",4500,10));
        this.smokeList.add(new Smoke("더원",4500,10));
        this.smokeList.add(new Smoke("던힐",4500,10));
        this.smokeList.add(new Smoke("한라산",4500,10));






    }


}





