package customer;

import item.Item;


// 장바구니 모델
public class Cart {

    // 필드 ========================================
    private int count = 0; // 제품의 수량
    private static int total; // 장바구니 총 금액
    Item item;         // 아이템


    // 생성자 ========================================
    public Cart() {
    }

    public Cart(Item item) {
        this.item = item;
        this.total = item.getPrice() * count; // 합계 = 아이템 가격 * 수량
    }

    // Getter, Setter ========================================

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public  int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    @Override
    public String toString() {
        return "[" + item + count + total + "]";
    }
}
