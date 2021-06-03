package Work.PR_work_6.AbstractFactory.website;

import Work.PR_work_6.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper пишет php код...");
    }
}
