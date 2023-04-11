package item;

public class Item {

    // 필드 ========================================
    private String itemName; // 품목명
    private int price; // 가격

    // 생성자 ========================================
    public Item() {
    }

    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Getter, Setter ========================================
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
