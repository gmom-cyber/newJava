package Work.PR_work_3;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class MySet {

    public static void main(String[] argv)
    {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(2);
            Set<String> set = new HashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");
            System.out.println("Set : " + set);
            Set<String> synset = Collections.synchronizedSet(set);
            System.out.println("Synchronized Set : " + synset);
            executor.submit(() -> {
                synset.add("D");
                System.out.println(synset);
            });
            executor.submit(() -> {
                synset.add("E");
                System.out.println(synset);

            });
        }
        catch (IllegalArgumentException e) {
            System.out.println("E : " + e);
        }
    }
}