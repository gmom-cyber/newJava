package Work.PR_work_8.Strategy;

import Work.PR_work_8.State.Activity;

public class Training implements Activity {
    @Override
    public void jastDoIt() {
        System.out.println("Training...");
    }
}
