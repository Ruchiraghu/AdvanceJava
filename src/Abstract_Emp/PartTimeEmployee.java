package Abstract_Emp;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
  public PartTimeEmployee(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }
    @Override
    public void calculateSalary() {
        System.out.println(hourlyRate);

    }
}
