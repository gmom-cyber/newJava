package Work.PR_work_6.Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("EnterpriseWebsite");
    }

    @Override
    void buildCms() {
    website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
    website.setPrice(7000);
    }
}
