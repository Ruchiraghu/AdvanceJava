import java.util.HashSet;
import java.util.Locale;
import java.util.TreeSet;

public class July19_hashSet {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        for(String word:words){
            hashset.add(word);

        }
        TreeSet<String> sorted = new TreeSet<>(hashset);
        System.out.println(sorted);

    }
}
