package Work.PR_work_6.AbstractFactory;

public interface PrTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
