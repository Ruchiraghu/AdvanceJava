package Abstract_Emp;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee p = new PartTimeEmployee(12000);
        FullTimeEmployee f = new FullTimeEmployee(200);
        System.out.print("Part time job pay: ");
        p.calculateSalary();
        System.out.print("Full time job hourly pay: ");
        f.calculateSalary();

    }
}
