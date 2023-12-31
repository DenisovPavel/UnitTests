## *Задание 1. *Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет. #

>Предположим что для создания Приложения «Записная книжка» у нас имеются:
1.	Базовый Класс BasicPhoneContactParameters параметров контакта;
2.	Класс Contact создает объект человека на основе данных BasicPhoneContactParameters;
3.	Класс который RepositoryContact хранит всех контактов в записной книжке и имеет методы:
4.	rebaseContact –редактирования контакта в RepositoryContact;
5.	removeContact –удаления контакта из RepositoryContact;
6.	сreateContact – создание контакта из RepositoryContact;


### Юнит тесты: 

1.	Проверка метода добавления контакта;
2.	Проверка метода редактирования контакта;
3.	Проверка метода удаления контакта;
4.	Проверка добавления фамилии контакта;
5.	Проверка добавления имени контакта;
6.	Проверка добавления телефонного номера контакта;
7.	Проверка добавления фамилии с количеством символов не меньше 4;
8.	Проверка добавления фамилии с количеством символов не больше 16;
9.	Проверка добавления имени с количеством символов не меньше 4;
10.	Проверка добавления имени с количеством символов не больше 16;
11.	Проверка выброса исключения при некорректном вводе фамилии.
12.	Проверка выброса исключения при некорректном вводе имени.
13.	Проверка выброса исключения при некорректном вводе телефона.
14.	Проверка RepositoryContact на добавления в него  Contact объект – на примере мок объекта;
15.	Проверка RemoveContact на удаление из RepositoryContact Contact объект – на примере мок объекта;
16.	Проверка RebaseContact на изменение у RepositoryContact  Contact объект – на примере мок объекта;



### Интеграционные тесты:

1.	Проверка взаимодействия между собой BasicPhoneContactParameters  и Contact;
2.	Проверка взаимодействия между собой Contact и RepositoryContact ;
3.	Проверить взаимодействие и использование BasicPhoneContactParameters, Contact, RepositoryContact на полноценное взаимодействие.
      E2E тесты:
1.	Проверить через интерфейс пользователя добавление Контакта в систему.
2.	Проверить через интерфейс пользователя удаления Контакта из системы.
3.	Проверить через интерфейс пользователя редактирования Контакта в системе.



## *Задание 2. *Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.

### 1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".

- Так как данное поведение метода работает локально в одном модуле, исключительно затрагивая несколько полей одного класс , следует сделать вывод что это юнит тест.

### 2. ""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".

- Используя пользовательский интерфейс при проверки добавления нового контакта мы используем сквозное тестерирование(Е2Е)

### 3.""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

- сходя из того что, идет полный цикл проверок, соответственно мы смотрим что все модули корректно взаимодействуют друг с другом.
Следует отметить что не только объекты классов , а также их методы. Следует сделать вывод что это интеграционные тесты для проверки взаимодействия.
нтакта в системе.