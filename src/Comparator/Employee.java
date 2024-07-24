package Comparator;

class Employee {
    int empId;
    String name;
    double Salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "comparator_{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
