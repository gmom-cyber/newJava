package Work.PR_work_6.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    static DeveloperFactory createDeveloperBySpecialty(String Specialty){
        if(Specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }else if (Specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else{
            throw new RuntimeException(Specialty+"НЕ знаю");
        }
    }
}
