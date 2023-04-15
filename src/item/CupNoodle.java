package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CupNoodle extends Item {

    private static List<CupNoodle> cupNoodleList;

    static {
        cupNoodleList = new ArrayList<>(Arrays.asList(
                new CupNoodle("신라면", 1500, 10),
                new CupNoodle("왕뚜껑", 1200, 10),
                new CupNoodle("너구리", 1400, 10),
                new CupNoodle("튀김우동", 1100, 10),
                new CupNoodle("참깨라면", 1300, 10)
        ));
    }
    public CupNoodle() {}



    public CupNoodle(String itemName, int price, int num) {
        super(itemName, price, num);
    }


    public List<CupNoodle> getCupNoodleList() {
        return cupNoodleList;
    }


}


