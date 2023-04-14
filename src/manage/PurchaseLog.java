package manage;

import customer.Customer;
import customer.CustomerController;

import java.util.List;

public class PurchaseLog {

    private Customer customer;
    private CustomerController cc;

    private List<Customer> customerList;

    public void showPurchaseLog() {

        System.out.println(customerList);
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
