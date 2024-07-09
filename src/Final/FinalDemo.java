package Final;

public class FinalDemo {
//   final int  MAX_VALUE = 100;
//   FinalDemo(int MAX_Value){
//       //can't reassign value to final variable
//       this.MAX_VALUE = MAX_Value;
//   }
    final int MAX_VALUE;//if you dont provide value to the instance variable
    FinalDemo(int MAX_VALUE){
        this.MAX_VALUE = MAX_VALUE;
    }
    public static void main(String[] args) {
       FinalDemo fd = new FinalDemo(12);
        System.out.println(fd.MAX_VALUE);
        FinalDemo fd1 = new FinalDemo(23);
        System.out.println(fd1.MAX_VALUE);
    }
}

