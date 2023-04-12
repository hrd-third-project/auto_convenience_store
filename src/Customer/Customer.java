package customer;

public class Customer {

    // 필드 ========================================
    private String name;
    private int age;
    private String phoneNumber;
    private int money;


    // 생성자 ========================================
    public Customer() {
    }

    public Customer(String name, int age, String phoneNumber, int money) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.money = money;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birth=" + age +
                ", phoneNumber=" + phoneNumber +
                ", money=" + money +
                '}';
    }
}
