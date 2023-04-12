package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liquor extends Item {

    private static List<Liquor> liquorList;
    private static final int accessAge = 19;

    static  {
        liquorList = new ArrayList<>(Arrays.asList(
                new Liquor("참이슬", 1800, 10),
                new Liquor("처음처럼", 1800, 10),
                new Liquor("새로", 1800, 10),
                new Liquor("카스", 1800, 10),
                new Liquor("진로", 1800, 10)
        ));
    }

    //매개변수 전달
    public Liquor(String itemName, int price, int num) {
        super(itemName, price, num);
    }

    public static int getAccessAge() {
        return accessAge;
    }

    public static List<Liquor> getLiquorList() {
        return liquorList;
    }
}
