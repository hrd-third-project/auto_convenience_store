package customer;

public class CustomerController {

    public boolean isExist(int age, int money) {

        if (age != 0 && money >= 3000) return true;
    }
    return false;



}
