package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CupNoodle extends Item {

    List<CupNoodle> cupNoodleList;

    public CupNoodle() {

        cupNoodleList = new ArrayList<>(Arrays.asList(
                new CupNoodle("신라면", 1100, 10),
                new CupNoodle("왕뚜껑", 1100, 10),
                new CupNoodle("튀김우동", 1100, 10),
                new CupNoodle("참깨라면", 1100, 10),
                new CupNoodle("너구리", 1100, 10)
        ));
    }

    public CupNoodle(String itemName, int price, int num) {

    }
}


