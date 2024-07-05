package Abstract_Emp;

public class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(double salary){
        this.salary = salary;
    }
    @Override
   public void calculateSalary() {
        System.out.println(salary);
    }

}
