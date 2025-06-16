package Inheritance;


class Employee {
    private int empId;
    private String name;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;


    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        double variableComponent;
        if (experience <= 2) {
            variableComponent = basicPay * 0.05;
        } else if (experience <= 5) {
            variableComponent = basicPay * 0.07;
        } else {
            variableComponent = basicPay * 0.10;
        }
//        super.setSalary(this.getBasicPay() + this.getHra() + variableComponent);
        System.out.println("Total Salary is "+variableComponent);
    }
}

class ContractEmployee extends Employee {
    private double wages;
    private int hours;

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary() {
        System.out.println("Total Salary is "+this.getHours()*this.getWages());
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Input (For PermanentEmployee):
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setEmpId(101);
        permanentEmployee.setName("Anil");
        permanentEmployee.setBasicPay(10000);
        permanentEmployee.setHra(1500);
        permanentEmployee.setExperience(3);
        permanentEmployee.calculateSalary();

        //Input for Contract Employee
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setEmpId(102);
        contractEmployee.setName("Ankit");
        contractEmployee.setHours(10);
        contractEmployee.setWages(500);
        contractEmployee.calculateSalary();
    }
}
