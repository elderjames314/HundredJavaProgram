package hundreds;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        String s1, s2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String 1:");
        s1 = scanner.nextLine();
        System.out.println("Enter String 2:");
        s2 = scanner.nextLine();

        if(s1.compareTo(s2) > 0) {
            System.out.println("first string is greater than s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("first string is less than s2");
        }else
            System.out.println("The are both equal");
    }
}
