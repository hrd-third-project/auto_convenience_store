package manage;

import static utility.Utility.*;

public class ManagerViewer {

    // 필드 ==============================
    private Manager mg;
    private IncomeCheck ic;
    private ItemStock is;
    private PurchaseLog pl;

    public ManagerViewer() {
        mg = new Manager();
        is = new ItemStock();
        ic = new IncomeCheck();
        pl = new PurchaseLog();
    }

    public void managerLogin() {

        String inputId = input("아이디 : ");
        String inputPwd = input("비밀번호 : ");

        if(mg.getID().equals(inputId) && mg.getPassword().equals(inputPwd)) {
            System.out.println("로그인에 성공하였습니다.");
            managerView();
        } else {
            System.out.println("잘못된 로그인 정보입니다.");
        }



    }
    private void managerView() {

        checkPoint:while(true) {
            System.out.println("============= 관리자 화면 =============");
            System.out.println("0. 로그아웃\n"
                    + "1. 품목 재고 확인창\n"
                    + "2. 판매 수입 확인창\n"
                    + "3. 고객 구매 로그창");
            String num = input(">> ");

            switch (num) {
                case "0":
                    break checkPoint;
                case "1":
                    is.showItemMenu();
                    break;
                case "2":
                    ic.showIncome();
                    break;
                case "3":
                    break;

            }

        }

    }

}
