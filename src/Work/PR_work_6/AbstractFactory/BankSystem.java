package Work.PR_work_6.AbstractFactory;

import Work.PR_work_6.AbstractFactory.banking.BankingTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        PrTeamFactory prTeamFactory = new BankingTeamFactory();
        Developer developer = prTeamFactory.getDeveloper();
        Tester tester = prTeamFactory.getTester();
        Manager manager = prTeamFactory.getManager();

        System.out.println("Создание банковской системы...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
