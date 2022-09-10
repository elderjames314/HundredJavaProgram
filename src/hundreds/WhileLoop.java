package hundreds;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your number: ");

        while ((c = scanner.nextInt()) != 0) {
            System.out.println("You enter "+ c);
            System.out.println("Enter another number");
        }

        System.out.println("end of the loop");
    }
}
