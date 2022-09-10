package hundreds;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoLargerNumber {

    public static void main(String[] args) {
        String firstNum, secondNum;
        System.out.println("Enter first large number: ");
        Scanner scanner = new Scanner(System.in);

        firstNum = scanner.nextLine();
        System.out.println("Enter your large number: ");
        secondNum = scanner.nextLine();

        BigInteger first = new BigInteger(firstNum);
        BigInteger second = new BigInteger(secondNum);

        BigInteger sum = first.add(second);

        System.out.println("Sum: "+ sum);

    }
}
