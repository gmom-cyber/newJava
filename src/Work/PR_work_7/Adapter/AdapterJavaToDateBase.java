package Work.PR_work_7.Adapter;

public class AdapterJavaToDateBase extends JavaApp implements DateBase{
    @Override
    public void insert() {
        save();
    }

    @Override
    public void select() {
        update();
    }

    @Override
    public void remove() {
        delete();
    }
}
