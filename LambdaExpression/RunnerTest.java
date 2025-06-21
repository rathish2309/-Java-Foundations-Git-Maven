package LambdaExpression;

public class RunnerTest {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(" Its me from thread");
        };
        runnable.run();
    }

}
