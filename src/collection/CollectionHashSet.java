package collection;
import java.util.HashSet;
public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();
        hashset.add("One");
        hashset.add("Two");
        hashset.add("Three");
        System.out.println(hashset);
        System.out.println(hashset.contains("One"));
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.toString());
    }
}
