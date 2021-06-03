package Work.PR_work_7.Proxy;

public class PRRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/gg/RealProject");
        project.run();
    }
}
