package bubbleSortAlgorithm;

import java.util.Scanner;

public class Impl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter no. of elements :");
        int num = input.nextInt();

        int[] values = new int[num];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter value at index  :"+i);
            values[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i <values.length ; i++) {
            for (int j = 0; j <values.length - i -1 ; j++) {
                if (values[j]> values[j+1]){
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted elements:");
        for (int val:values) {
            System.out.print(" "+ val);
        }

    }
}
