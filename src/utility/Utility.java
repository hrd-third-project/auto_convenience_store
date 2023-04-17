package utility;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Utility {

    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public Utility() {
    }

    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static void stop() {
        System.out.println("\n     *** Enter를 눌러서 계속 진행하기 *** ");
        sc.nextLine();
    }




}
