package july3;

public class Student {
    public int add(int a, int b){
        int c = a+b;
        System.out.println("Two parameters");
        return c;


    }
    public double add(double a,double b,double c){
        double d  = a+b+c;
        System.out.println("Using three parameters");
        return d;
    }
    //var agrs
    public int add(int ...a){
        int num=0;
        System.out.println("Var-agrs");
        for (int c:a) {
            num += c;

        }
        return num;
    }
    public static void main(String[] args) {
        Student s = new Student();

       int e =  s.add(12,12);
       double t= s.add(1,2,3);
        int ee =  s.add(12,12,1,2,3,4,5,5,6,12,12,11);
        System.out.println("Add: "+e);
        System.out.println("Add values: "+t);
        System.out.println(ee);
    }

}
