import java.util.Optional;
public class OptionalClass {

    public static void main(String[] args) {
        String[] words = new String[100];
        Optional<String> CheckNull = Optional.ofNullable(words[12]);
        if(CheckNull.isPresent()){
            String word = words[12].toLowerCase();
            System.out.println(word);
        }
        else{
            System.out.println("Null! no words presentcdd");
        }

    }
}
