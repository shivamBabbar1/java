public class Employee {
    private String name, title;
    private int salary;

    Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean raiseSalary(int percentage) {
        salary = salary + salary * percentage / 100;
        return true;
    }

    public String empDetail() {
        String a;
        // coverted int into String
        a = String.valueOf(salary);
        return "Name : " + name + ", Title : " + title + ", Salary : " + a;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("nanu", "Employee", 100000);

        System.out.println(e1.empDetail());
        System.out.print(e1.raiseSalary(10));
        System.out.println(e1.empDetail());
    }
}
