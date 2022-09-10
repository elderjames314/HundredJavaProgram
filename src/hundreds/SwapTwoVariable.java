package hundreds;

import java.util.Scanner;

public class SwapTwoVariable {

    public static void main(String[] args) {
        int x, y, temp;

        System.out.println("Enter the value of the X: ");
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        System.out.println("Enter the value of the Y: ");
        y= scanner.nextInt();

        System.out.println("Before swap");
        System.out.println();
        System.out.println("X: "+ x +"\nY: "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println();
        System.out.println("X: "+ x +"\ngiY: "+ y);

    }

}
