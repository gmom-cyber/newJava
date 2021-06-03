package Work.PR_work_8.Strategy;

import Work.PR_work_8.State.Activity;
import Work.PR_work_8.State.Reading;
import Work.PR_work_8.State.Sleeping;
import Work.PR_work_8.State.Training;
import Work.PR_work_8.State.Writing;

public class Developer {
    Activity activity;

    public Developer() {

    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.jastDoIt();

    }

}
