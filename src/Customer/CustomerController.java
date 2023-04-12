package customer;

public class CustomerController {

    /**
     * 고객 입장 유효성 검사
     * @param age - 나이를 입력하지 않는 경우, 입장 불가
     * @param money - 3,000원 이상 충전 시, 입장
     * @return 나이와 금액을 잘못입력하면 false
     */
    public boolean isExist(int age, int money) {
        if (age != 0 && money >= 3000) return true;
        return false;
    }







}
