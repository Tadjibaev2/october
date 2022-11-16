package nestedLoops;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапозон чисел");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        boolean isprime;
        for (int i = first; i < second; i++) {
            isprime = true;

            for (int j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    isprime = false;
            if (isprime)
                System.out.println(i + "-простое число");
        }
    }
}
