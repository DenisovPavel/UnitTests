package AllTypesTestDoublesEx;

import AllTypesTestDoublesEx.Spy.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {
// SPY - получает информацию, из оригинального метода оригинального класса.
// Оличается от мока тем, что получает не только целевую, а необходимую информацию.
// Он один в один как макито, позволяет записывать и сохранять все результаты + логи.
// В тесте создаем шпиона на интерфейс(с нулевой реализацией)
//- Создаем обьект оригинально класса UserService прокидывая в конструктор шпиона)
//- задаем ожидаемый результат,
//- задаем поведение шпиона при вызове метода.
//- Вызываем метод
//- И проверяем что метод был вызван один раз с правильными аргументами.

    @Test
    void testGetUserByIdWithSpy() {
// Создаем шпионский объект UserRepository
        UserRepository userRepository = Mockito.spy(UserRepository.class);

// Создаем экземпляр UserService, передавая шпионский объект
        //UserService userService = new UserService(userRepository);

// Задаем ожидаемый результат
//        int userId = 1;
//        User expectedUser = new User(userId, "JohnDoe");
//
//// Устанавливаем поведение для шпиона: при вызове метода getUserById вернуть ожидаемого пользователя
//        when(userRepository.getUserById(userId)).thenReturn(expectedUser);
//
//// Вызываем метод getUserById и проверяем, что результат соответствует ожиданиям
//        User user = userService.getUserById(userId);
//        assertEquals(expectedUser, user);
//
//// Проверяем, что метод getUserById был вызван ровно один раз с правильными аргументами
//        verify(userRepository, times(1)).getUserById(userId);
//    }
    }
// Простая система построения теста:
// 1 создали метод
// 2 создали шпиона на тестируемый обьект User user = spy(new User()); экземпляр внутри Шпиона
// 3 проверяем методы шпиона на отработку
// 4 проверяем через  verify(название шпиона). (тут идет любая проверка)
// 5 проверяем через  verify(название шпиона). (тут идет любая другая проверка)

//    @Test
//    void testVerifyMethodCall() {
//// Создаем шпионский объект User
//        User user = spy(new User());
//// Вызываем метод setName на шпионе
//        user.setName("John");
//
//// Проверяем, был ли вызван метод setName на шпионе ровно один раз
//        verify(user).setName("John");
//
//// Проверяем, что метод getName не был вызван на шпионе(метод только шпиона)
//        verify(user, never()).getName();
//    }

//    @Test
//    void testVerifyMethodCallWithTimes() {
//// Создаем шпионский объект User
//        User user = spy(new User());
//
//// Вызываем метод setName на шпионе дважды -
//        user.setName("John");
//        user.setName("Doe");
//
//// Проверяем, что метод setName был вызван дважды - проверяем что метод был вызван дважды с любым арг.
//        verify(user, times(2)).setName(anyString());
//    }
//
//    @Test
//    void testVerifyMethodCallAtLeastOnce() {
//// Создаем шпионский объект User
//        User user = spy(new User());
//
//// Вызываем метод setName на шпионе хотя бы один раз
//        user.setName("John");
//
//// Проверяем, что метод setName был вызван хотя бы один раз - просто хотя бы один раз с любым арг.
//        verify(user, atLeastOnce()).setName(anyString());
//    }
}