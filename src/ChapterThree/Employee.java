package ChapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    //private double yearlySalary;
    //private double salaryRaise;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void yearlySalary() {
        if (monthlySalary > 0.0)
            monthlySalary = monthlySalary * 12;
    }

    public void salaryRaise() {
        if (monthlySalary > 0.0)
            monthlySalary = monthlySalary + (monthlySalary * 0.1);
    }

  //  public double getYearlySalary() {
    //    return monthlySalary;
    //}

    //public double getSalaryRaise() {
      //  return monthlySalary;
    //}
}
