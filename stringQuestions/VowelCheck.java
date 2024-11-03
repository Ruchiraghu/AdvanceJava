package stringQuestions;

public class VowelCheck {
    public static boolean vowel(String in){
        return in.toLowerCase().matches(".*[aeiou].*");
    }
    public static boolean isConsonant(String in){
        for (char c: in.toLowerCase().toCharArray()){
            if (Character.isLetter(c)&&"aeiou".indexOf(c)==-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(vowel("Heyy"));
        System.out.println(isConsonant("kriti"));
    }
}
