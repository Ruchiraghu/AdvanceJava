package LambdaExpression;

public interface LambdaExpressionParameter {
    public void greeting(String hello,String bye);
    default void saying(){
        System.out.println("your soo pretty");
    }
}
