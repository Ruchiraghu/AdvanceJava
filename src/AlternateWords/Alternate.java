package AlternateWords;

public class Alternate {
    public static void main(String[] args) {
        String in = "This is a string for demo.";

        String[] words = in.split(" ");
        for(int i=0;i< words.length;i+=2){
            System.out.println(words[i]+" ");
        }
    }
}
