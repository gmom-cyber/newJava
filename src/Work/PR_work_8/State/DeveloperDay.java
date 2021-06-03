package Work.PR_work_8.State;

public class DeveloperDay {
    public static void main(String[] args) {

        Activity activity = new Sleeping();
        Developer developer = new Developer();
        developer.setActivity(activity);
        for(int i=0;i<7;i++){
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
