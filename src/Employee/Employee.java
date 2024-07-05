package Employee;

 class Employee {

    String name;
    String  id;
    int salary;
    String department;

    public Employee(String name,String id,int salary,String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = id;

    }
    public void display(){
        System.out.println("Details of employee: "+"\n"+"Name: "+this.name+", id: "+this.id+", salary: "+this.salary+", department: "+this.department);
    }
    public static void main(String[] args) {
Employee e = new Employee("ruchi","1212",12000,"IT");
e.display();
    }
}
