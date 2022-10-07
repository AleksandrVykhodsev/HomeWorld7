public class Main {
    public static void main(String[] args) {

        //Задание 1/1
        System.out.println("Задание 1/1 !!!");
        int amountPerMonth = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + amountPerMonth;
            month = month + 1;
            System.out.println(total);
        }
        System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");

        //Задание 1/2
        System.out.println("Задание 1/2 !!!");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a);
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a);
        }
        System.out.println();

        //Задание 1/3
        System.out.println("Задание 1/3 !!!");
        int totalPeople = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int growth = fertility - mortality;
        for (int i = 1; i <= 10; i++) {
            totalPeople = totalPeople + growth * 12_000_000 / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + totalPeople);
        }

        //Задание 2/1
        System.out.println("Задание 2/1 !!!");
        int depositAmount = 15000;
        int month1 = 1;
        for (; depositAmount < 12_000_000; month1++) {
            depositAmount = depositAmount + depositAmount * 7 / 100;
            System.out.println(depositAmount);
        }
        System.out.println("Месяцев потребуется " + month1);

        //Задание 2/2
        System.out.println("Задание 2/2 !!!");
        int depositAmount2 = 15000;
        int month2 = 1;
        for (; depositAmount2 < 12_000_000; month2++) {
            depositAmount2 = depositAmount2 + depositAmount2 * 7 / 100;
            if (month2 % 6 == 0) {
                System.out.println(depositAmount2);
            }
        }

        //Задание 2/3
        System.out.println("Задание 2/3 !!!");
        int depositAmount3 = 15000;
        int month3 = 1;
        for (; month3 <= 108; month3++) {
            depositAmount3 = depositAmount3 + depositAmount3 * 7 / 100;
            if (month3 % 6 == 0) {
                System.out.println(depositAmount3);
            }
        }

        //Задание 2/4
        System.out.println("Задание 2/4 !!!");
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        //Задание 3/1
        System.out.println("Задание 3/1 !!!");
        int cometFlight = 0;
        while (cometFlight < 2022) {
            cometFlight = cometFlight + 79;
            if (cometFlight >= 1822 && cometFlight <= 2122) {
                System.out.println(cometFlight);
            }
        }
        //Задание 3/2
        System.out.println("Задание 3/2 !!!");
        int c = 2;
        for (int d = 1; d <= 10; d++) {
            int total2 = c * d;
            System.out.println(c + "*" + d + "=" + total2);
        }
        System.out.println("Спасибо за проверку!!!");

    }
}