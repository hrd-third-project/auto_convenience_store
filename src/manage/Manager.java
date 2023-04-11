package manage;

public class Manager {

    // 필드 ========================================
    private String ID;
    private int password;

    // 생성자 ========================================
    public Manager() {
    }

    public Manager(String ID, int password) {
        this.ID = ID;
        this.password = password;
    }

    // Getter, Setter ========================================
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
