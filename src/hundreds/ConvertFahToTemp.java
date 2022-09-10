package hundreds;

import java.util.Scanner;

public class ConvertFahToTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fah;

        System.out.println("Please enter your fah value? ");

        fah = scanner.nextInt();

        int temp = ((fah - 32) * 5) / 9;

        System.out.println("Temp is: "+ temp);




    }
}
