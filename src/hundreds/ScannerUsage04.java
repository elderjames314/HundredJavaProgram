package hundreds;

import java.util.Scanner;

public class ScannerUsage04 {
    public static void main(String[] args) {
        String s;
        int a;
        float b;

        Scanner schanner = new Scanner(System.in);

        System.out.println("Enter string");
        s = schanner.nextLine();
        System.out.println("You entered: "+ s);

        System.out.println("Enter integer");
        a = schanner.nextInt();
        System.out.println("You enter: "+ a);

        System.out.println("Enter float");
        b = schanner.nextFloat();
        System.out.println("You entered: "+ b);
    }
}
