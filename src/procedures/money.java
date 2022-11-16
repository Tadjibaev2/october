package procedures;

import java.util.Scanner;

public class money {

    public static void main(String[] args) {
        int choice;
        int secChoice;
        double amount;
        double som, tenge, dollar, rubl, euro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Валюты доступные для обмена:");
        System.out.println("Enter 1: Сом");
        System.out.println("Enter 2: Рубль");
        System.out.println("Enter 3: Тенге");
        System.out.println("Enter 4: Евро");
        System.out.println("Enter 5: Доллар");

        System.out.println("\nВыберите валюту: ");
        choice = sc.nextInt();

        System.out.println("В какую валюту хотите перевести?");
        System.out.println("Enter 1: Сом");
        System.out.println("Enter 2: Рубль");
        System.out.println("Enter 3: Тенге");
        System.out.println("Enter 4: Евро");
        System.out.println("Enter 5: Доллар");
        secChoice = sc.nextInt();

        System.out.println("Сколько хотите перевести?");
        amount = sc.nextFloat();

        switch (choice) {
            case 1: // сом
                if (secChoice == 1) {
                    System.out.println("Столько же");
                }
                if (secChoice == 3) {
                    tenge = amount * 6;
                    System.out.println(amount + " Сом = " + tenge + " Тенге");
                }
                if (secChoice == 4) {
                    euro = amount / 80;
                    System.out.println(amount + " Сом = " + euro + " Euro");
                }
                if (secChoice == 5) {
                    dollar = amount / 85;
                    System.out.println(amount + " Сом = " + dollar + " Долларов");
                }
                if (secChoice == 2) {
                    rubl = amount / 1.35;
                    System.out.println(amount + " Сом = " + rubl + " Рублей");
                }
                break;

            case 2: // Rubles
                if (secChoice == 2) {
                    System.out.println("Столько же");
                }
                if (secChoice == 1) {
                    som = amount / 1.35;
                    System.out.println(amount + " Рублей = " + som + " Сом ");
                }
                if (secChoice == 3) {
                    tenge = amount / 9;
                    System.out.println(amount + " Рублей = " + tenge + " Teнге");
                }
                if (secChoice == 4) {
                    euro = amount / 60;
                    System.out.println(amount + " Рублей = " + euro + " Eвро");
                }
                if (secChoice == 5) {
                    dollar = amount / 58;
                    System.out.println(amount + " Рублей = " + dollar + " Долларов");
                }
                break;

            case 3: // Тенге
                if (secChoice == 3) {
                    System.out.println("Какой дурак тенге на тенге меняет)");
                }
                if (secChoice == 1) {
                    som = amount / 6;
                    System.out.println(amount + " Тенге = " + som + " Сом");
                }
                if (secChoice == 2) {
                    rubl = amount / 9;
                    System.out.println(amount + " Тенге = " + rubl + " Рублей");
                }
                if (secChoice == 4) {
                    euro = amount / 456;
                    System.out.println(amount + " Тенге = " + euro + " Евро");
                }
                if (secChoice == 5) {
                    dollar = amount / 470;
                    System.out.println(amount + " Тенге = " + dollar + " Долларов");
                }
                break;

            case 4: // Euro
                if (secChoice == 4) {
                    System.out.println("Зачем менять Евро на Евро");
                }
                if (secChoice == 1) {
                    som = amount * 83;
                    System.out.println(amount + " Euro = " + som + " Сом");
                }
                if (secChoice == 2) {
                    rubl = amount * 58;
                    System.out.println(amount + " Euro = " + rubl + " Рублей");
                }
                if (secChoice == 3) {
                    tenge = amount * 456;
                    System.out.println(amount + " Euro = " + tenge + " Тенге");
                }
                if (secChoice == 5) {
                    dollar = amount * 0.98;
                    System.out.println(amount + " Euro = " + dollar + " Долларов");
                }
                break;

            case 5: // Dollar
                if (secChoice == 5) {
                    System.out.println("Доллар на доллар не меняем");
                }
                if (secChoice == 1) {
                    som = amount * 85;
                    System.out.println(amount + " Dollar = " + som + " Сом");
                }
                if (secChoice == 2) {
                    rubl = amount * 60;
                    System.out.println(amount + " Dollar = " + rubl + " Рублей");
                }
                if (secChoice == 3) {
                    tenge = amount * 440;
                    System.out.println(amount + " Dollar = " + tenge + " Тенге");
                }
                if (secChoice == 4) {
                    euro = amount * 1.02;
                    System.out.println(amount + " Dollar = " + euro + " Долларов");
                }
                break;

            default:
                System.out.println("Введите только цифры 1-5");
        }
    }
}

