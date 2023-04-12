package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smoke extends Item {

    private static List<Smoke> smokeList;
    private static final int accessAge = 19;


    static  {
        smokeList = new ArrayList<>(Arrays.asList(
                new Smoke("말보르", 4500, 10),
                new Smoke("에쎄체인지", 4500, 10),
                new Smoke("더원", 4500, 10),
                new Smoke("던힐", 4500, 10),
                new Smoke("한라산", 4500, 10)
        ));
    }


    public Smoke() {
    }

    public Smoke(String itemName, int price, int num) {
        super(itemName, price, num);
    }


    public static int getAccessAge() {
        return accessAge;
    }

    public static void setSmokeList(List<Smoke> smokeList) {
        Smoke.smokeList = smokeList;
    }

     public static List<Smoke> getSmokeList() {
        return smokeList;
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
