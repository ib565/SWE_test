import java.util.Arrays;
import java.util.Comparator;

public class Assignment {
    public static void main(String[] args) {
        Employee emp1 = new Employee("161E90", "Ramu", 35, 59000);
        Employee emp2 = new Employee("171E22", "Tejas", 30, 82100);
        Employee emp3 = new Employee("171G55", "Abhi", 25, 100000);
        Employee emp4 = new Employee("152K46", "Jaya", 32, 85000);

        Employee[] employees = {emp1, emp2, emp3, emp4};
        Company comp = new Company(employees);
        Employee[] sortedEmployees = comp.sortEmployeesBySalary();
        System.err.println("Sorted Employees by Salary");
        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String EmployeeID;
    private String Name;
    private int Age;
    private int Salary;

    public Employee(String EmployeeID, String Name, int Age, int Salary) {
        this.EmployeeID = EmployeeID;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    public String toString() {
        return "EmployeeID: " + EmployeeID + " Name: " + Name + " Age: " + Age + " Salary: " + Salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }
}

class Company{
    private Employee[] employees;

    public Company(Employee[] employees2) {
        this.employees = employees2;
    }

    public Employee[] sortEmployeesBySalary() {
        Arrays.sort(employees, Comparator.comparingInt(Employee::getSalary));
        return employees;
    }
}