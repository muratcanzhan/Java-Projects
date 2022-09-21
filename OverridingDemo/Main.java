public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new TeacherCreditManager(), new FarmCreditManager(),new StudentCreditManager()};

        for(BaseKrediManager krediManager:krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}