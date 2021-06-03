package Work.PR_work_6.AbstractFactory.banking;

import Work.PR_work_6.AbstractFactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM занимается проектом...");
    }
}
