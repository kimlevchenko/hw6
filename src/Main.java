public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("");
        task2();
        System.out.println("");
        task3();
        System.out.println("");
        task4();
        System.out.println("");
        task5();
        System.out.println("");
        task6();
        System.out.println("");
        task7();
        System.out.println("");
        task8();
        System.out.println("");
        task9();
        System.out.println("");
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int money = 29_000;
        int totalMoney = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double money = 29_000;
        double totalMoney = 0;
        double precent = 0.12;
        for (int i = 1; i <= 12; i++) {
            totalMoney = (totalMoney + money) * (1 + precent / 12);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}
