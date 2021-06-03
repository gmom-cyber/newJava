package Work.PR_work_3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class MyMap {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        map.put("Даниил", "8-800-555-35-35");
        executor.submit(() -> {
            lock.writeLock().lock();
            try {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put("Никита", "8-800-666-36-36");
            } finally {
                lock.writeLock().unlock();
            }
        });
        System.out.println(map);
    }
}
