package Work.PR_work_5;

public class S1 {
        private S1 instance;
        public synchronized S1 getInstance() {
            if (instance == null) {
                instance = new S1();
            }
            return instance;
        }
}
