import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("Задача 1");
        int salary = 15000;
        float total = 0;
        int month = 0;
        while (total < 2_459_000 + month++) {
            total = total + salary;

            System.out.println("Месяцев " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Задача 3");

        int population = 12000000;
        int fertilityPerThousand = 17;
        int mortalityPerThousnd = 8;
        int currentYear = 2024;
        int year = 10;
        for (year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousnd / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");

        int mani = 15000;
        double percent = 7D / 100;
        int desiredSun = 12_000_000;
        int month1 = 0;
        while (mani < desiredSun) {
            mani = (int) (mani * (1 + percent));
            month1++;
            System.out.println("Месяцев " + month1 + ", сумма накоплений равна " + mani + " рублей");
        }

        System.out.println("Задача 5");

        mani = 15000;
        percent = 7D / 100;
        desiredSun = 12_000_000;
        month1 = 0;
        while (mani < desiredSun) {
            mani = (int) (mani * (1 + percent));
            month1++;
            if (month1 % 6 == 0)
                System.out.println("Месяцев " + month1 + ", сумма накоплений равна " + mani + " рублей");
        }

        System.out.println("Задача 6");

        mani = 15000;
        percent = 7D / 100;
        month1 = 0;
        int months = 12 * 9;
        while (month1 < months) {
            mani = (int) (mani * (1 + percent));
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяцев " + month1 + ", сумма накоплений равна " + mani + " рублей");
            }
        }
            System.out.println("Задача 7");

            int firstFriday = 4;
            for (int day = firstFriday; day <= 31; day += 7) {
                System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчет");}

            System.out.println("Задача 8");

            int period = 79;
            int startSeeing = 0;
            int start = currentYear - 200;
            int end = currentYear + 100;
            for (int year1 = startSeeing; year1 < end; year1 += period) {
                if (year1 > start) {
                    System.out.println(year1);}
            }
        }
    }
