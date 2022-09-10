package hundreds;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigNumber {

    public static void main(String[] args) {
        int n, c = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the factorial number: ");

        n = scanner.nextInt();

        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        if(n < 0) {
            System.out.println("It seems you enter negative number");
        }else {
            for(c = 1; c <= n; c++) {
                fact = fact.multiply(inc);
                inc = inc.add(BigInteger.ONE);
            }

            System.out.println("The factorial of "+ n + " is "+ fact);
        }
    }
}
