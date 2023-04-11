package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item {



    // 필드 ========================================
    private String itemName; // 품목명
    private int price; // 가격
    private int num; //재고

    // 생성자 ========================================
    public Item() {
        List<Item> items = new ArrayList<>(Arrays.asList(


        ));
    }

    public Item(String itemName, int price,int num) {
        this.itemName = itemName;
        this.price = price;
        this.num=num;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //


    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
