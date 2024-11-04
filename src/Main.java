import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задание 1");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySun = 0;
        for (int salary : salaryArray) {
            salarySun += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySun + " рублей");
    }

    private static void task2() {
        System.out.println("Задание 2");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int minExpenses = salaryArray[0];
        int maxExpenses = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < minExpenses) {
                minExpenses = salary;
            }

            if (salary > maxExpenses) {
                maxExpenses = salary;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }

    private static void task3() {
        System.out.println("Задание 3");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        float salarySun = 0;
        for (int salary : salaryArray) {
            salarySun += salary;
        }
        System.out.println("Средняя трата за месяц составила " + salarySun / salaryArray.length + " рублей");
    }


    private static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >- 0; i--) {
        }
        System.out.println();
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.print(Arrays.toString(reverseFullName));
        System.out.print(reverseFullName);
            }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
