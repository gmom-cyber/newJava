package Work.PR_work_4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class pr4{
    private int cout = 0;
    private ExecutorService exe;

    public pr4(int cout) {
        this.cout = cout;
        exe = Executors.newFixedThreadPool(cout);
        exe.submit(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 1");
        });
        exe.submit(() -> System.out.println("Поток 2"));
    }

}
