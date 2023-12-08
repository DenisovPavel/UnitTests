package AllTypesTestDoublesEx;

import AllTypesTestDoublesEx.Stub.PaymentGateway;
import AllTypesTestDoublesEx.Stub.PaymentGatewayStub;
import AllTypesTestDoublesEx.Stub.PaymentProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

//STUB - заменяет реальные компоненты, от них зависит тест система(предоставляет тест ответы, нужен контролируемый результат)
//    Это таже фиктивная заглушка как и Dummy, однако логика такая:
//    1 -Есть оригинальный класс со своим методом !
//    2 -Создаем интерфейс оригинального класса с таким же методом(но пустым) Это псевдо платежная система, она
//    якобы работает как оригинальная, но работу системы(логику) мы определяем уже в заглушке PaymentGatewayStub
//    3 - Создаем стаб класс оригинального класса имплементируя интерфейс и оверрайдим метод интерфейса под свои параметры.
//    4 - Пишем тест на оригинальный класс, создаем обьект заглушки прокидывая его в конструктор оригинального
//    и проверяем значения)

    // Оригинальный класс -> PaymentProcessor для которого создаем -> интерфейс PaymentGateway(в котором создаем
    // аналогичный метод как и в классе оригинале, после чего создаем -> PaymentGatewayStub
    // ( тут имплементируем уже интерфейс с схожим методом оригинального класса и меняем его под свою логику)
    // Однако тест пишется на оригинальный класс, а не на класс PaymentGatewayStub

    @Test
    void testProcessPayment() {
// Создаем заглушку для платежной системы
        PaymentGateway paymentGateway = new PaymentGatewayStub();

// Создаем экземпляр PaymentProcessor, передавая заглушку
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

// Вызываем метод processPayment с фиксированной суммой
        boolean result = paymentProcessor.processPayment(50.0);

// Проверяем, что результат соответствует ожиданию (сумма положительная)
        assertTrue(result);
    }
}
