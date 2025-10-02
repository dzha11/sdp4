package bridge;

public abstract class Phone {
    protected OperatingSystem os; // операционная система

    public Phone(OperatingSystem os) {
        this.os = os; // сохраняем систему
    }

    public abstract void start(String app); // запуск телефона с приложением
}
