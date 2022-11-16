package procedures;

import java.util.Scanner;

public class dva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = a+b;
        double abv = sum/2;
        System.out.println(abv);
    }
}
