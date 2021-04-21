import java.util.concurrent.CompletableFuture;

/**
 * @author xinghailong at 2021-04-06 10:27 下午
 */
public class Test {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.completedFuture(null);
        future.thenCompose((ignored)->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello");
//            return "aaaa";
            return null;
        });
        System.out.println("bbbb");
    }
}
