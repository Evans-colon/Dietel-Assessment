package ChapterThree;


public class EmployeeTest {
    public static void main(String[] args) {

        Employee newEmployee = new Employee("john", "Michael", 45000.00);
        Employee secondNewEmployee = new Employee("Mark", "Matthew", 27000.00);

        System.out.println("the new Employee name is: " + newEmployee.getFirstName());

    double newEmployeeMonthlySalary = newEmployee.getMonthlySalary();
    System.out.println("John michael's monthly salary is "+ newEmployeeMonthlySalary);

    double secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
    System.out.println("Mark Matthew's monthly Salary is "+ secondNewEmployeeMonthlySalary);

    secondNewEmployee.setMonthlySalary(56000.00);
    secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("Mark matthew's current monthly salary is "+ secondNewEmployeeMonthlySalary);

   secondNewEmployee.yearlySalary();
   secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("Mark Matthew's current yearly salary is "+ secondNewEmployeeMonthlySalary);


   secondNewEmployee.salaryRaise();
   secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("Mark Matthew's current salary raise is "+ secondNewEmployeeMonthlySalary);



    }
}
