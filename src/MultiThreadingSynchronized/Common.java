package MultiThreadingSynchronized;

public class Common {
    public static synchronized void fun(String name){
        System.out.println("Welcome! ");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(name);
    }
}
