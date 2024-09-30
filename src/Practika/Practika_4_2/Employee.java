package Practika.Practika_4_2;

class Employee{
    public  String Name;
    public  double BaseSalary;

    public Employee(String name, double baseSalary) {
        Name = name;
        BaseSalary = baseSalary;

    }

    public String getName() {
        return Name;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setBaseSalary(double baseSalsry) {
        BaseSalary = baseSalsry;
    }

}

class Permanent{
    public void calculateSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 1.2);
    }
}

class Contract{
    public void calculateSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 1.1);
    }
}


class Intern{
    public void calculatSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 0.8);
    }
}
