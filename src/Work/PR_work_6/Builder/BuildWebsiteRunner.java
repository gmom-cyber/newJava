package Work.PR_work_6.Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());//VisitCardWebsiteBuilder заменить на EnterpriseWebsiteBuilder
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
