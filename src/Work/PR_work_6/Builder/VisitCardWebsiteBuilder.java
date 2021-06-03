package Work.PR_work_6.Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(400);

    }
}
