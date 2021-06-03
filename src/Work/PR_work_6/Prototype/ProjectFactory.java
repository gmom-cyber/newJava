package Work.PR_work_6.Prototype;

public class ProjectFactory {
    Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
