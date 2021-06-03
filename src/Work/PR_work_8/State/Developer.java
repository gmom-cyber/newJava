package Work.PR_work_8.State;

public class Developer {
    Activity activity;

    public Developer() {

    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleeping){
            setActivity(new Training());
        }else if(activity instanceof Training){
            setActivity(new Writing());
        }else if (activity instanceof Writing){
            setActivity(new Reading());
        }else if (activity instanceof Reading){
            setActivity(new Sleeping());
        }

    }
    void justDoIt(){
        activity.jastDoIt();
    }
}
