package MultiThreadingSynchronized;

public class ThreadB extends Thread{
    Common c;
    String name;

    public ThreadB(Common c, String name) {
        this.c = c;
        this.name = name;
    }
    public void run(){
        c.fun(name);
    }
}
