package Work.PR_work_8.Strategy;

import Work.PR_work_8.State.Activity;

public class Sleeping implements Activity {
    @Override
    public void jastDoIt() {
        System.out.println("Sleeping...");
    }
}
