public class Main {

    public static Employee createEmploye(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        return employee;
    }

    public static Employee calculateMinSalary(Employee[] employees) {
        employees = new Employee[10];
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return null;
    }

    public static int getSumSalary() {
        int result = 0;
        Iterable<? extends Employee> employees = null;
        for (Employee employee : employees) {
            result += employee.getSalary();
        }
        return result;
    }

    public static Employee calculateMinSalary() {
        Employee[] employees = new Employee[0];
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
            return minSalaryEmployee;
        }

    public static Employee calculateMaxSalary(Employee[] employees) {
        Employee[] calculateMaxSalary = new Employee[0];
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }
    public static double calculateAverageSalary(Employee[] employees) {
        double calculateAverageSalary = (double) getSumSalary() / employees.length;
        return calculateAverageSalary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmploye("Иванов И.И. ", 1, 31521);
        employees[1] = createEmploye("Петров И.И. ", 2, 35647);
        employees[2] = createEmploye("Русаков И.И. ", 3, 56214);
        employees[3] = createEmploye("Свиридов И.И. ", 4, 52450);
        employees[4] = createEmploye("Агапов И.И. ", 5, 32562);
        employees[5] = createEmploye("Глухарев И.И. ", 1, 25400);
        employees[6] = createEmploye("Черенков И.И. ", 2, 12000);
        employees[7] = createEmploye("Антошин И.И. ", 3, 65890);
        employees[8] = createEmploye("Земская И.И. ", 4, 84750);
        employees[9] = createEmploye("Пьяников И.И. ", 5, 21500);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("Общая сумма расходов на заработную плату в месяц: " + getSumSalary());
        System.out.println("Сотрудник с минимальной заработной платой: " + calculateMinSalary());
        System.out.println("Сотрудник с максимальной заработной платой: " + calculateMaxSalary());
        System.out.println("Средняя заработная плата в месяц: " + calculateAverageSalary());
        System.out.println("Список сотрудников: ");
    }

    private static String calculateAverageSalary() {
        return null;
    }

    private static String calculateMaxSalary() {
        return null;
    }


    private static int calculateSalary(Employee[] employees) {
        return 0;
    }
    }

