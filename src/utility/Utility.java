package utility;

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


}
