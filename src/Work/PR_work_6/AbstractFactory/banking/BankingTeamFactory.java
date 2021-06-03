package Work.PR_work_6.AbstractFactory.banking;

import Work.PR_work_6.AbstractFactory.Developer;
import Work.PR_work_6.AbstractFactory.Manager;
import Work.PR_work_6.AbstractFactory.PrTeamFactory;
import Work.PR_work_6.AbstractFactory.Tester;

public class BankingTeamFactory implements PrTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
