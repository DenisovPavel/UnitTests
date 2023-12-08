package AllTypesTestDoublesEx.Spy;

import AllTypesTestDoublesEx.Spy.UserRepository;

//SPY -
//получает информацию, из оригинального метода оригинального класса.
//Оличается от мока тем, что получает не только целевую, а необходимую информацию.
//Он один в один как макито, позволяет записывать и сохранять все результаты + логи.
//В тесте создаем шпиона на интерфейс(с нулевой реализацией)
//- Создаем обьект оригинально класса UserService прокидывая в конструктор шпиона)
//- задаем ожидаемый результат,
//- задаем поведение шпиона при вызове метода.
//- Вызываем метод
//- И проверяем что метод был вызван один раз с правильными аргументами.
public class UserService {
    private UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public User getUserById(int userId) {
//// Логика получения пользователя из репозитория
//        return userRepository.getUserById(userId);
//    }
}