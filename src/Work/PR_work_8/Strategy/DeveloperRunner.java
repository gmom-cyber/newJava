package Work.PR_work_8.Strategy;

public class DeveloperRunner {
    public static void main(String[] args) {//В STATE мы управляли сменой активности в классе девелопер

        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Writing());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
