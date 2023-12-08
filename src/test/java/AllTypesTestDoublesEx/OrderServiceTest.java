package AllTypesTestDoublesEx;

import AllTypesTestDoublesEx.Fake.FakePaymentGateway;
import AllTypesTestDoublesEx.Fake.OrderService;
import AllTypesTestDoublesEx.Fake.PaymentGatway;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    // Fake - также заменяет реальные компоненты, но предоставляет свою функциональность в упрощенной или
//   более легкой формы, имитируют функц.реальных компонентов без полной реализации.
//
//1- Есть обычный интерфейс PaymentGatway - для обработки платежа.
//2 - мы имеем класс OrderService - зависит от PaymentGatway:
//3 - в OS мы создаем тип поля PaymentGatway(определяем переменную)
//4 - в конструкторе мы создаем сам обьект ( PaymentGatway)
//5 - OS напрямую зависит от PG(удаляя PG не получится создать обьект OS)
//
// placeOrder метод OS -> мы хотим написать на него тест, но не хотим использовать PG
//
//ЛОГИКА:
// 1 -Мы создаем поддельный класс FakePaymentGateway
// (имитирует реальный PG, но не выполняет реальных платежей банковской системы)
// 2 - Создаем тест на OS используя подделку:
//  -  PaymentGatway fakePaymentGatway = new FakePaymentGateway();
//  - Создаем экземпляр OrderService с подделкой
//  - OrderService orderService = new OrderService(fakePaymentGatway);
//  - Имитируем реальный платеж всевдо обьектом с псевдометодом.
//  - Проверяем на ассерте на подлинность
//  - assertTrue(result);

    @Test
    void testPlaceOrderWithFakePaymentGateway() {
// Создаем подделку FakePaymentGateway
        PaymentGatway fakePaymentGatway = new FakePaymentGateway();

// Создаем экземпляр OrderService с подделкой
        OrderService orderService = new OrderService(fakePaymentGatway);

// Вызываем метод placeOrder и ожидаем успешного платежа
        boolean result = orderService.placeOrder(100.0);

// Проверяем, что платеж был успешным
        assertTrue(result);
    }
}