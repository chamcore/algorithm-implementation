package euclidAlgorithm;

import java.util.Scanner;

public class Impl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int value1 = input.nextInt();
        System.out.println("Enter the second value: ");
        int value2 = input.nextInt();
        int remainder;
        do {
            remainder = value1 % value2;
            if (remainder !=0){
                value1 = value2;
                value2 = remainder;
            }


        }while (remainder !=0);
        System.out.println("GCD is :"+value2);
    }
}
