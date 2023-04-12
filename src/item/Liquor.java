package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liquor extends Item {

    private static List<Liquor> liquorList;
    private static final int accessAge = 19;

    static {
        liquorList = new ArrayList<>(Arrays.asList(
                new Liquor("참이슬", 1800, 10),
                new Liquor("처음처럼", 1800, 10),
                new Liquor("새로", 1800, 10),
                new Liquor("카스", 1800, 10),
                new Liquor("진로", 1800, 10)
        ));
    }

    public Liquor() {
    }

    //매개변수 전달
    public Liquor(String itemName, int price, int num) {
        super(itemName, price, num);

    }


    public int getAccessAge() {
        return accessAge;
    }

    public static void setLiquorList(List<Liquor> liquorList) {
        Liquor.liquorList = liquorList;
    }

    @Override
    public String toString() {
        return super.toString() +"\t\t\t"+
                " * 나이제한: " + accessAge + "이상 구매가능";
    }

    public static List<Liquor> getLiquorList() {
        return liquorList;


    }

}
