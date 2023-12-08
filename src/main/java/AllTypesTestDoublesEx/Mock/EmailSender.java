package AllTypesTestDoublesEx.Mock;

public interface EmailSender {
// Mock -полностью проверяет реализацию поведения которое мы ожидаем, с тем которое на самом деле есть!
//    Используется хранилище, просто мок-лист, с помощью его мы проверяем добавляются ли обьекты,
//    удаляются ли, их статусы и т.д.
//    Вся реализация по сути идет в мок-листе.
//    Имитация, для замены реальных компонентов или зависимостей.В отличии от других,
//    он непосредственно более гибкий обширный, но также заглушка.
//    Позволяет проверять выходы методов имитировать сценарии взаимодействия и проверяет систему.
//    Логика следующая:
//    1- есть сервис отправки писем EmailService со своим методом sendWelcomeEmail(на который будут писаться тесты)
//    2 - есть интерфейс EmailSender - имитация реального сервиса.
//    3 - мы не хотим отправлять реальные письма с сервиса, поэтому в оригинальном классе EmailService- мы создаем
//    обьект EmailSender и прокидываем его в метод sendWelcomeEmail
//    (а уже в этом методе мы реализуем метод обьекта=интерфейса EmailSender)
//    4 - в тестах на оригинальный класс мы проверяем корректность логики
    void sendEmail(String to, String subject, String body);
}