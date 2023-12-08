package AllTypesTestDoublesEx;

import AllTypesTestDoublesEx.Mock.EmailSender;
import AllTypesTestDoublesEx.Mock.EmailService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class EmailServiceTest {

    // Mock - полностью проверяет реализацию поведения которое мы ожидаем, с тем которое на самом деле есть!
//    Используется хранилище, просто мок-лист, с помощью его мы проверяем добавляются ли обьекты,
//    удаляются ли, их статусы и т.д.
//    Вся реализация по сути идет в мок-листе.
//    Имитация, для замены реальных компонентов или зависимостей.В отличии от других,
//    он непосредственно более гибкий обширный, но также заглушка.
//    Позволяет проверять выховы методов имитировать сценарии взаимодействия и проверяет систему.
//    Логика следующая:
//    1- есть сервис отправки писем EmailService со своим методом sendWelcomeEmail(на который будут писаться тесты)
//    2 - есть интерфейс EmailSender - имитация реального сервиса.
//    3 - мы не хотим отправлять реальные письма с сервиса, поэтому в оригинальном классе EmailService- мы создаем
//    обьект EmailSender и прокидываем его в метод sendWelcomeEmail
//    (а уже в этом методе мы реализуем метод обьекта=интерфейса EmailSender)
//     4 в тестах на оригинальный класс мы проверяем корректность логики

    @Test
    void testSendWelcomeEmailWithMock() {
// Создаем имитацию (мок) для интерфейса EmailSender
        EmailSender emailSender = mock(EmailSender.class);

// Создаем экземпляр EmailService с имитацией EmailSender(с фиктивным обьектом)
        EmailService emailService = new EmailService(emailSender);

// Задаем ожидаемый результат
        String to = "user@example.com";

// Вызываем метод sendWelcomeEmail
        emailService.sendWelcomeEmail(to);

// Проверяем, что метод sendEmail был вызван с правильными аргументами
        verify(emailSender).sendEmail(to, "Добро пожаловать", "Добро пожаловать на наш сайт!");
    //verify(объект).имяМетода(параметр); -убедиться, что тестируемый класс вызвал нужные методы нужных объектов.
    // verify - проверяет что метод sendEmail относится к обьекту emailSender
    // verify - проверяет что метод был вызван с определенными аргументами.
    // "Добро пожаловать", "Добро пожаловать на наш сайт!" -> подставленные значения в тесте.
    // "Добро пожаловать", "Добро пожаловать на наш сайт!" -> оригинальные аргументы находятся в классе  EmailService
    // Мы также можем установить другие ожидания и проверки в этом тесте, если это необходимо

        // Задаем ожидаемый результат
//        String to = "user@example.com";
//        String subject = "Добро пожаловать";
//        String body = "Добро пожаловать на наш сайт!";

// Мы также можем установить другие ожидания и проверки в этом тесте, если это необходимо

// Пример: Проверка, что метод sendEmail был вызван только один раз
//        verify(emailSender, times(1)).sendEmail(anyString(), anyString(), anyString());

// Пример: Установка ожидания исключения при вызове метода sendEmail
 // метод макито(ошибка отправки письма("")-> при вызове emailSender с методом sendEmail(сравнить 1 арг с error@example
//        doThrow(new RuntimeException("Ошибка отправки письма")).when(emailSender).sendEmail(eq("error@example.com"),
//                anyString(), anyString());

// Пример: Проверка, что метод sendEmail не был вызван для конкретного адреса
//        verify(emailSender, never()).sendEmail(eq("another@example.com"), anyString(), anyString());

// Пример: Проверка, что метод sendEmail был вызван с определенными аргументами в определенной последовательности
//        InOrder inOrder = inOrder(emailSender);
                                             //-eq -проверяет 1 аргумент на равенство с аргументом в ориг.классе методе
//        inOrder.verify(emailSender).sendEmail(eq("user@example.com"), anyString(), anyString());
//        inOrder.verify(emailSender).sendEmail(eq("admin@example.com"), anyString(), anyString());
    }
}
