package construct;

public  class Student {
    int roll_no;
    String name;
    int Class;
    String school;


    public Student(String school) {
        this.school = school;
    }

    Student(int RollNo, String Name, int Class){
      this.roll_no= RollNo;
      this.name = Name;
      this.Class = Class;
    }
    void schoolName(){
        System.out.println("My school name is: "+this.school);
    }
    public void studentDetails(){
        System.out.println("My name is "+this.name+" class "+this.Class+" roll no. "+this.roll_no);
    }


}
