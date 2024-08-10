public class ObjectCount {
    private static int objectCount = 0;


    public static int getObjectCount() {
        return objectCount++;
    }
    public static void main(String[] args) {
        ObjectCount c1 = new ObjectCount();
        ObjectCount c2 = new ObjectCount();
        ObjectCount c3 = new ObjectCount();
        ObjectCount c4 = new ObjectCount();
        ObjectCount c5 = new ObjectCount();
        System.out.println(c1.getObjectCount());
        System.out.println(c2.getObjectCount());
        System.out.println(c3.getObjectCount());
        System.out.println(c4.getObjectCount());
        System.out.println(c5.getObjectCount());

        System.out.println("Total: "+ObjectCount.getObjectCount());
    }
}
