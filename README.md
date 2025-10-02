# Bridge Pattern – Smartphone Project

## Introduction
В этом проекте демонстрируется паттерн **Bridge** на Java.  
Цель паттерна – разделить **абстракцию** (Smartphone) и **реализацию** (Operating System), чтобы можно было независимо менять и расширять их.

## Implementation
Проект состоит из следующих классов:

### bridge/Phone.java
Абстрактный класс или интерфейс для телефонов (в нашем случае просто общий класс для смартфонов).

### bridge/Smartphone.java
Класс смартфона, который содержит ссылку на `OperatingSystem`.  
Позволяет запускать приложения на разной ОС.

### bridge/OperatingSystem.java
Интерфейс для операционных систем, с методами:
- `boot()` – загрузка системы
- `runApp(String app)` – запуск приложения

### bridge/AndroidOS.java
Реализация `OperatingSystem` для Android.

### bridge/iOS.java
Реализация `OperatingSystem` для iOS.

## Example Usage
```java
OperatingSystem android = new AndroidOS();
OperatingSystem ios = new iOS();

Smartphone galaxy = new Smartphone("Galaxy S24", android);
Smartphone iphone = new Smartphone("iPhone 15 Pro", ios);

galaxy.start("WhatsApp");   // запускаем WhatsApp на андроиде
iphone.start("Instagram");  // запускаем Instagram на айос


аутпут:
Booting Android OS...
Running app: WhatsApp on Android
Booting iOS...
Running app: Instagram on iOS
