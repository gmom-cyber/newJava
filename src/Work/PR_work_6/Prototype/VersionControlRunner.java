package Work.PR_work_6.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "System.out.print('ПРИВЕТ МИР')");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println("--------------------------------------");
        System.out.println(masterClone);

    }
}
