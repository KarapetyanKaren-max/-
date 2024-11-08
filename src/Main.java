public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int year = 2021;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является высокостным ");
        } else {
            System.out.println(year + " год не является высокостным ");

        }
    }
}