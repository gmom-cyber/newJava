package Work.PR_work_7.Proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Скачивание "+url+"...");
    }
    @Override
    public void run() {
        System.out.println("running pr "+url+"...");
    }
}
