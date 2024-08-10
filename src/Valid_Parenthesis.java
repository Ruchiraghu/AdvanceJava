import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Valid_Parenthesis {
    public boolean isValid(String s) {
        Map<Character,Character> validParenthesis = new HashMap<>();
        validParenthesis.put(')','(');
        validParenthesis.put('}','{');
        validParenthesis.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(char c :s.toCharArray()){
            if(validParenthesis.containsKey(c)){
                char topElement = stack.isEmpty()?'#':stack.pop();
                if(topElement!=validParenthesis.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Valid_Parenthesis vp = new Valid_Parenthesis();
        System.out.println(vp.isValid("()"));
        System.out.println(vp.isValid("()[]{}"));
        System.out.println(vp.isValid("(]"));

    }
}
