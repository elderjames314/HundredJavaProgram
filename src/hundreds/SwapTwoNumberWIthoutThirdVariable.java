package hundreds;

import java.util.Scanner;

public class SwapTwoNumberWIthoutThirdVariable {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for X: ");
        x = scanner.nextInt();

        System.out.println("Enter value for Y: ");
        y = scanner.nextInt();

        System.out.println("Before swap\nX: "+ x +"\nY: "+ y);

        System.out.println("************************");

        System.out.println("after swap\nX: "+ x +"\nY: "+ y);

        x = x + y;
        System.out.println("X: "+ x);
        y = x - y;
        System.out.println("Y: "+ y);
        x = x - y;
        System.out.println("X: "+ x);
    }
}
