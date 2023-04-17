package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liquor extends Item {

    private static List<Liquor> liquorList;
    private final int accessAge = 19;

    static {
        liquorList = new ArrayList<>(Arrays.asList(
                new Liquor("참이슬", 1800, 10),
                new Liquor("보드카", 45000, 10),
                new Liquor("막걸리", 3500, 10),
                new Liquor("하이네켄", 1800, 10),
                new Liquor("처음처럼", 1800, 10)
        ));
    }
    public Liquor() {}

    //매개변수 전달
    public Liquor(String itemName, int price, int num) {
        super(itemName, price, num);

    }


    public int getAccessAge() {
        return accessAge;
    }

    public void setLiquorList(List<Liquor> liquorList) {
        liquorList = liquorList;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public List<Liquor> getLiquorList() {
        return liquorList;


    }

}
