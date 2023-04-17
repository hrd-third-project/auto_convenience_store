package customer;

import item.Item;
import item.ItemController;
import utility.Utility;
import view.CartViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CartController {

    private static List<Item> cartlist;

    public ItemController ic;
    private Cart mycart;
    private CartViewer cv;
    public void setCartList(Item item) {
        cartlist = cartlist;
    }
    public List<Item> getCartList() {
        return cartlist;
    }

    public CartController() {
        mycart = new Cart();
    }

    static {
        cartlist = new ArrayList<>();
    }

    // 카트에 품목을 지우는 메서드
    public void deleteItem() {
        List<Item> cartList = getCartList();

        String delItem = Utility.input("\n * 삭제하고자 하는 상품명을 입력하세요! ^0^ \n   >> ");

        // 삭제하고자 하는 상품이 카트리스트에 존재유무 확인
        boolean flag = cartList.stream()
                .anyMatch(item -> item.getItemName().equals(delItem));

        if (flag) {
            List<Item> removeItem = cartList.stream()
                    .filter(item -> item.getItemName().equals(delItem))
                    .limit(1)
                    .collect(Collectors.toList());

            int delItemIndex = -1;

            for (int i = 0; i < cartList.size(); i++) {
                if (cartList.get(i).getItemName().equals(delItem)) {
                    delItemIndex = i;
                    break;
                }
            }
            cartList.remove(delItemIndex);


            //  해당 상품의 재고를 다시 1 추가
            for (Item item : removeItem) {
                item.setNum(item.getNum() + 1);
                System.out.println(item.getItemName() + "을/를 장바구니에서 삭제하였습니다.");
            }


            // 장바구니 목록 재호출
            cv = new CartViewer();
            cv.myCart();

        } else {
            System.out.println("입력하신 상품은 장바구니에 존재하지 않습니다.");
        }


    }


}
