package bridge;

public class Smartphone extends Phone {
    private String model; // модель телефона

    public Smartphone(String model, OperatingSystem os) {
        super(os);         // передаем систему в базовый класс
        this.model = model; // сохраняем модель
    }

    @Override
    public void start(String app) {
        System.out.println("Starting " + model + "...");
        os.boot();          // запускаем ОС
        os.runApp(app);     // запускаем приложение
    }
}
