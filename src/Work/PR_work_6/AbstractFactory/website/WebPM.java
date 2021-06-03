package Work.PR_work_6.AbstractFactory.website;

import Work.PR_work_6.AbstractFactory.Manager;

public class WebPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("WebPM работает с сайтом...");
    }
}
