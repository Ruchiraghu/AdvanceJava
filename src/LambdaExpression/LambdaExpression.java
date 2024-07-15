package LambdaExpression;
@FunctionalInterface
interface LambdaExpression {
    public void words();
    default void say(){
        System.out.println("Say something beautiful!");
    }
}
