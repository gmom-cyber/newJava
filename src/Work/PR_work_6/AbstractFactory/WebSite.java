package Work.PR_work_6.AbstractFactory;

import Work.PR_work_6.AbstractFactory.website.WebsiteTeamFactory;

public class WebSite {
    public static void main(String[] args) {
        PrTeamFactory prTeamFactory= new WebsiteTeamFactory();
        Developer developer = prTeamFactory.getDeveloper();
        Tester tester = prTeamFactory.getTester();
        Manager manager = prTeamFactory.getManager();

        System.out.println("Создание веб-сайта...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
