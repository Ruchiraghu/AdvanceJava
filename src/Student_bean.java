import construct.Student;

public class Student_bean {

    private String name;
    private String roll_no;
    private int ClassNum;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(String roll_no){
        this.roll_no = roll_no;
    }
    public int getClassNum(){
        return ClassNum;
    }
    public void setClassNum(int Class){
        this.ClassNum = Class;
    }

    @Override
    public String toString() {
        return "Student_bean{" +
                "name='" + name + '\'' +
                ", roll_no='" + roll_no + '\'' +
                ", ClassNum=" + ClassNum +
                '}';
    }

    public static void main(String[] args) {
        Student_bean s = new Student_bean();
        s.setName("Ruchi");
        s.setRoll_no("123223");
        s.setClassNum(12);
        System.out.println(s.toString());
        System.out.println("Name: "+s.getName());
        System.out.println("Roll_no: "+s.getRoll_no());
        System.out.println("Class: "+s.getClassNum());

    }
}
