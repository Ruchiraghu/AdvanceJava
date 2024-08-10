package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception{
        int sum=0;
        for(int i =1;i<=10;i++){
            sum+=i;

        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> f = executor.submit(new MyCallable());
        int result = f.get();
        System.out.println(result);
        executor.shutdown();

    }
}
