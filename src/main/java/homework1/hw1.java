package homework1;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 1, 1);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 5, true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            int a = (int)(Math.random() * 21) - 10;
            int b = (int)(Math.random() * 21) - 10;
            int c = (int)(Math.random() * 21) - 10;
            checkSign(a, b, c);
        } else if (choice == 3) {
            selectColor();
        } else if (choice == 4) {
            compareNumbers();
        } else if (choice == 5) {
            int initValue = (int)(Math.random() * 100);
            int delta = (int)(Math.random() * 50);
            boolean increment = Math.random() > 0.5;
            addOrSubtractAndPrint(initValue, delta, increment);
        } else {
            System.out.println("Неверный выбор");
        }

        scanner.close();
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int)(Math.random() * 30);

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println("Результат " + result);
    }
}
