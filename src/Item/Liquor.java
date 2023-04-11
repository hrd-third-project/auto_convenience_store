package Item;

public class Liquor extends Item {

    private int accessAge;


    public Liquor() {
    }

    public Liquor(int accessAge) {
        this.accessAge = accessAge;
    }

    public Liquor(String itemName, int price, int accessAge) {
        super(itemName, price);
        this.accessAge = accessAge;
    }


    @Override
    public String toString() {
        return "Liquor{" +
                "accessAge=" + accessAge +
                '}';
    }
}
