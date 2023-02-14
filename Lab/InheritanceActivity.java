package anudip;


class Employee { //Base Class Employee
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) { //Overloaded Constructor of Employee Class
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() { //Calculate Salary
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100); //Local variable
        System.out.println(salary);
    }

    public void calculateTransportAllowance() { //Calculate Travel Allowance
        double transportAllowance = 10 * basicSalary/100;
        System.out.println(transportAllowance);
    }
}

class Manager extends Employee { //Derived Class Manager extending Employee Class
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) { 
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public void calculateTransportAllowance() { // Travel Allowance is 15% for the Manager
        double transportAllowance = 15 * basicSalary/100;
        System.out.println(transportAllowance);
    }
}

class Trainee extends Employee {

    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) { 
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        System.out.print("Manager's Basic Salary: ");
        double managerBasicSalary = m1.basicSalary;
        System.out.println(managerBasicSalary);
        System.out.print("Manager's Salary: ");
        m1.calculateSalary();
        System.out.print("Manager's Travel Allowance: ");
        m1.calculateTransportAllowance();
        Trainee t1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.print("Trainee's Basic Salary: ");
        double traineeBasicSalary = t1.basicSalary;
        System.out.println(traineeBasicSalary);
        System.out.print("Trainee's Salary: ");
        t1.calculateSalary();
        System.out.print("Trainee's Travel Allowance: ");
        t1.calculateTransportAllowance();
    }
}
