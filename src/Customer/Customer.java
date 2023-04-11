package customer;

public class Customer {

    // 필드 ========================================
    private String name;
    private int birth;
    private int phoneNumber;
    private int money;


    // 생성자 ========================================
    public Customer() {
    }

    public Customer(String name, int birth, int phoneNumber, int money) {
        this.name = name;
        this.birth = birth;
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

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
                ", birth=" + birth +
                ", phoneNumber=" + phoneNumber +
                ", money=" + money +
                '}';
    }
}
