package az.iktlab.util;

import java.sql.Statement;
import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int getMenu() {
        int index = sc.nextInt();
        return index;
    }

    public static int getFlightId() {
        System.out.println("Enter flight id:");
        int index = sc.nextInt();
        return index;
    }
}