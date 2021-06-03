package Work.PR_work_5;

public class S3 {//тут уже не страшны потоки, однако объект сразу инициализирован и в таком случае нельзя обработать
        //исключительные ситуации
        private static S3 instance = new S3();

        private S3() {
        }

        public static S3 getInstance(){
            return instance;
        }
}
