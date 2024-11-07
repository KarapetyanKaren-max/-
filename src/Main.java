public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника - " + fullName);

        String fullNam = "fullName";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        String fullNam2 ="Иванов Семён Семёнович";
        char oldChar;
        char newChar;
        System.out.println(fullNam2.replace(oldChar = 'ё', newChar = 'е'));
    }
}