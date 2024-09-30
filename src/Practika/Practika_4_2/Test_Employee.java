package Practika.Practika_4_2;

public class Test_Employee {
    public static void main(String[] args) {
        Employee permanentEmployee = new Employee("Aslan", 3000);
        Employee contractEmployee = new Employee("Arman", 4000);
        Employee internEmployee = new Employee("Beka", 1500);
        System.out.println(permanentEmployee.getName() + "'s salary: " + calculateSalary(permanentEmployee, 1.2));
        System.out.println(contractEmployee.getName() + "'s salary: " + calculateSalary(contractEmployee, 1.1));
        System.out.println(internEmployee.getName() + "'s salary: " + calculateSalary(internEmployee, 0.8));
    }

    private static double calculateSalary(Employee employee, double multiplier) {
        return employee.getBaseSalary() * multiplier;
    }
}
