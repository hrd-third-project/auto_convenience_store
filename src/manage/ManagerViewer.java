package manage;

import static utility.Utility.*;

public class ManagerViewer {

    // 필드 ==============================
    private Manager mg;
    private ItemStock is;
    private PurchaseLog pl; // 구매로그 + 판매수입확인

    public ManagerViewer() {
        is = new ItemStock();
        pl = new PurchaseLog();
    }

    public void managerLogin() {
        mg = new Manager();
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
                    + "2. 고객 구매 로그창");
            String num = input(">> ");

            switch (num) {
                case "0":
                    break checkPoint;
                case "1":
                    is.showItemMenu();
                    break;
                case "2":
                    pl.showPurchaseLog();
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
                    break;

            }

        }

    }

}
