package Work.PR_work_6.AbstractFactory.website;

import Work.PR_work_6.AbstractFactory.Developer;
import Work.PR_work_6.AbstractFactory.Manager;
import Work.PR_work_6.AbstractFactory.PrTeamFactory;
import Work.PR_work_6.AbstractFactory.Tester;
import Work.PR_work_6.AbstractFactory.banking.BankingPM;
import Work.PR_work_6.AbstractFactory.banking.QATester;

public class WebsiteTeamFactory implements PrTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebPM();
    }
}
