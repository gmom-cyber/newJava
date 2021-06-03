package Work.PR_work_7.Adapter;

public class DateBaseRunner {
    public static void main(String[] args) {
        DateBase dateBase = new AdapterJavaToDateBase();
        dateBase.insert();
        dateBase.remove();
        dateBase.select();
        dateBase.update();
    }
}
