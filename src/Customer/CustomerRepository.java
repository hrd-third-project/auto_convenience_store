package Customer;

public class CustomerRepository {

    // 필드 =============================
    private Customer customer;



    // 메서드 =============================

    // 고객을 등록하는 기능
    public void register(Customer customerInfo) {
        this.customer = customerInfo;
    }



    // 마이페이지 기능

    public Customer findCustomer() {
        return customer;
    }




}
