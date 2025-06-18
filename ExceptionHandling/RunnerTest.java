package ExceptionHandling;


class Employee {

    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empName, int empAge, double empSalary) {
        super();
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

}

/*
Create an Exception class “EmpSalaryException" with an appropriate constructor.
 */

class EmpSalaryException extends Exception{
    EmpSalaryException(String message){
        super(message.toLowerCase());
    }
}


public class RunnerTest {

    public void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
       if(emp.getEmpSalary()<1000){
           throw new EmpSalaryException("OOH, salary is less than 1000");
       }
       else{
           System.out.println("Salary is "+emp.getEmpSalary());
       }
    }



    public static void main(String[] args) throws EmpSalaryException {
        Employee e1 = new Employee("Joe Smith",20,5345);
        Employee e2 = new Employee("Lewis Jane",21,1345);
        Employee e3 = new Employee("Larry Page",22,245);
        Employee e4 = new Employee("Smith James",23,945);
        Employee e5 = new Employee("Elvis George",25,1425);

        RunnerTest runnerTest = new RunnerTest();
        runnerTest.checkEmployeeSalary(e1);
        runnerTest.checkEmployeeSalary(e3);
    }


}