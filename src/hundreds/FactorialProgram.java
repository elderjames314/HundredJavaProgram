package hundreds;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        int n, c, fact = 1;
        System.out.println("Enter number to compute to factorial");
        Scanner scanner = new Scanner(System.in);

        c = scanner.nextInt();

        if (c < 0) {
            System.out.println("It seems you enter negative number");
        }else {
            for(n=1; n <= c; n++)
                fact = fact * n;

            System.out.println("The factorial of "+ c +" is "+ fact);
        }

    }
}
