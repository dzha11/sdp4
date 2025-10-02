package bridge;

public class AndroidOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Android OS..."); // андроид стартует
    }

    @Override
    public void runApp(String app) {
        System.out.println("Running " + app + " on Android"); // запуск приложения на андроиде
    }
}
