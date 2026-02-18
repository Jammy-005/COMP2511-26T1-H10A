package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");


        int sum = 0;
        for (String number : numbers) {
            int element = Integer.parseInt(number);
            sum += element;
        }

        System.out.println(sum);

        scanner.close();
    }
}
