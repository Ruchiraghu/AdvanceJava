package Aggregation;

public class Main {
    Department department;
    public void display(){
        System.out.println("Display"+department.departmentName);
    }
  public static void main(String[] args) {

      Professor p = new Professor("Aditi Rai");
      Department d = new Department("Computer Science",p);
      University u = new University("Barkatullah","Bhopal",d);
      System.out.println(u.department.professor.name);
      u.display();
      d.display();

    }
}
