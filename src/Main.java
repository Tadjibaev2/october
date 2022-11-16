import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String line = scanner2.nextLine();
        getTable(x, y, line);
    }

    public static void getTable(int start, int end, String message) {
        for (int i = start; i <= 10; i++) {
            for (int j = end; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                System.out.println("GET_TABLE " + message);
            }
            System.out.println("\n");
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}