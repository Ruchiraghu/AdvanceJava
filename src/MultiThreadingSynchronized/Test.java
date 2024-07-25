package MultiThreadingSynchronized;

public class Test {
    public static void main(String[] args) {
        Common c = new Common();
        Common c1 = new Common();

        ThreadA a = new ThreadA(c,"Ruchi");
        ThreadB b = new ThreadB(c,"Abhi");
        a.start();
        b.start();
    }
}
