package Work.PR_work_5;

public class Test {//Синглтон
    public static void main(String[] argv){
        S1 a = new S1();
        a.getInstance();
        S2 b = S2.getInstance();
        S3 c = S3.getInstance();
    }
}