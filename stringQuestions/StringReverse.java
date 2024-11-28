package stringQuestions;

public class StringReverse {

    public static String reverse(String in){
        if (in==null)
            throw new IllegalArgumentException("String is null.");
            StringBuilder out = new StringBuilder();
            char[] chars = in.toCharArray();
            for (int i=chars.length-1;i>=0;i--)
                out.append(chars[i]);
        return out.toString();
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(reverse(str));

    }
}