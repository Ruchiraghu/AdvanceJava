public class hello {
    public static void main(String[] args) {
       System.out.println("Hello world!");
        Integer i = new Integer(12);
        System.out.println(i);
        Character c = new Character('a');
        System.out.println(c);
//        hello h = new hello();
//        h.main(12);
        hello.main(16);
    }

    public static void main(Integer args) {
        System.out.println("Int");
    }
    public static void main(Character c){
        System.out.println("Char");
    }

}
