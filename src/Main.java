public class Main {
    public  static Employee createEmploye(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        return employee;
    }
    public static int calculateSalary(Employee[] employees) {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employeeNew = employees[i];
            if (employeeNew != null) {
                result  = result + employeeNew.getSalary();

            }
        }
        return result;
    }
    public static int calculateMaxSalary(Employee[] employees1) {
        long maxSalary = - 1;
        for (int i = 0; i < employees1.length; i++) {
            //Employee employee = employees[i];
            if (employees1 > maxSalary) {
                maxSalary = employees1[i];
            }
        }
    }
    public static void main(String[] args){


    }
    }
