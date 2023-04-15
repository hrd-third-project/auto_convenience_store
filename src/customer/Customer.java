package customer;

import item.Item;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    // 필드 ========================================
    private String name;
    private int age;
    private String phoneNumber;
    private int chargeAmount;
    private List<String> itemNames;
    private int payment = 0;


    // 생성자 ========================================
    static {

    }

    public Customer() {
        itemNames = new ArrayList<>();
    }

    public Customer(String name, int age, String phoneNumber, int chargeAmount) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.chargeAmount = chargeAmount;
    }

    // Getter, Setter ========================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
    public List<String> getItemNames() {
        return itemNames;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", chargeAmount=" + chargeAmount +
                ", payment=" + payment +
                ", itemNames=" + itemNames +
                '}';
    }

}
