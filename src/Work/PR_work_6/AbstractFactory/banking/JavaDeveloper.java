package Work.PR_work_6.AbstractFactory.banking;

import Work.PR_work_6.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Ява разработчик пишет код...");
    }
}
