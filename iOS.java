package bridge;

public class iOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting iOS..."); // айос стартует
    }

    @Override
    public void runApp(String app) {
        System.out.println("Running " + app + " on iOS"); // запуск приложения на айос
    }
}
